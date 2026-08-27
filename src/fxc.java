import java.net.InetSocketAddress;

public interface fxc {
   String a();

   String b();

   int c();

   InetSocketAddress d();

   static fxc a(final InetSocketAddress $$0) {
      return new fxc() {
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
