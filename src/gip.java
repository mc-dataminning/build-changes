import java.net.InetSocketAddress;

public interface gip {
   String a();

   String b();

   int c();

   InetSocketAddress d();

   static gip a(final InetSocketAddress $$0) {
      return new gip() {
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
