import java.net.InetSocketAddress;

public interface gaw {
   String a();

   String b();

   int c();

   InetSocketAddress d();

   static gaw a(final InetSocketAddress $$0) {
      return new gaw() {
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
