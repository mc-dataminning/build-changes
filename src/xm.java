import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record xm(List<xm.a> a) implements ve<wx> {
   private static final int b = 2097152;

   public xm(so $$0) {
      this($$0.a(xm.a::new));
   }

   public static xm a(List<dhk> $$0) {
      return new xm($$0.stream().map(xm.a::new).toList());
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public static record a(cpi a, byte[] b) {
      public a(dhk $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new so(this.d()), $$0);
      }

      public a(so $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dhk $$0) {
         int $$1 = 0;

         for (dhl $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public so a() {
         return new so(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(so $$0, dhk $$1) {
         for (dhl $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(so $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cpi b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
