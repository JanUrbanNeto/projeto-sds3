import axios from "axios";
import Chart from "react-apexcharts";
import { SaleSum } from "types/Sale";
import { BASE_URL } from "utils/request";

type ChartData = {
   labels: string[],
   series: number[]
}

const DonutChart = () => {

   let chartData : ChartData = { labels: [], series: [] };

   axios.get(`${BASE_URL}/sales/sum-by-seller`)
      .then((response) => {
         const data = response.data as SaleSum[];
         const myLabels = data.map(x => x.sellerName);
         const mySeries = data.map(x => x.sum);

         //console.log(response.data);
      });

   const options = {
      legend: {
         show: true
      }
   };

/*   const mockData = {

      series: [477138, 499928, 444867, 220426, 473088],
      labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
   };
*/

   return (
      <Chart
         options={{ ...options, labels: chartData.labels }}
         series={chartData.series}
         type="donut"
         height="240"
      />
   );
}

export default DonutChart;