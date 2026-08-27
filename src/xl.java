import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record xl(List<xl.a> a) implements vd<ww> {
   private static final int b = 2097152;

   public xl(so $$0) {
      this($$0.a(xl.a::new));
   }

   public static xl a(List<dhq> $$0) {
      return new xl($$0.stream().map(xl.a::new).toList());
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public static record a(cpc a, byte[] b) {
      public a(dhq $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new so(this.d()), $$0);
      }

      public a(so $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dhq $$0) {
         int $$1 = 0;

         for (dhr $$2 : $$0.d()) {
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

      public static void a(so $$0, dhq $$1) {
         for (dhr $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(so $$0) {
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
