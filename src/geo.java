import java.net.InetSocketAddress;

public interface geo {
   String a();

   String b();

   int c();

   InetSocketAddress d();

   static geo a(final InetSocketAddress $$0) {
      return new geo() {
         @Override
         public String a() {
            return $$0.getAddress().getHostName();
         }

         @Override
         public String b() {
            return $$0.getAddress().getHostAddress();
         }

         @Override
         public int c() {
            return $$0.getPort();
         }

         @Override
         public InetSocketAddress d() {
            return $$0;
         }
      };
   }
}
