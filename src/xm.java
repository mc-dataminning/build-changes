import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record xm(List<xm.a> a) implements ve<wx> {
   private static final int b = 2097152;

   public xm(sp $$0) {
      this($$0.a(xm.a::new));
   }

   public static xm a(List<dhq> $$0) {
      return new xm($$0.stream().map(xm.a::new).toList());
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public static record a(cpc a, byte[] b) {
      public a(dhq $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new sp(this.d()), $$0);
      }

      public a(sp $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dhq $$0) {
         int $$1 = 0;

         for (dhr $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public sp a() {
         return new sp(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(sp $$0, dhq $$1) {
         for (dhr $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(sp $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cpc b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
