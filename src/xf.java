import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record xf(List<xf.a> a) implements ux<wp> {
   private static final int b = 2097152;

   public xf(si $$0) {
      this($$0.a(xf.a::new));
   }

   public static xf a(List<dhh> $$0) {
      return new xf($$0.stream().map(xf.a::new).toList());
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public static record a(cot a, byte[] b) {
      public a(dhh $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new si(this.d()), $$0);
      }

      public a(si $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dhh $$0) {
         int $$1 = 0;

         for (dhi $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public si a() {
         return new si(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(si $$0, dhh $$1) {
         for (dhi $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(si $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cot b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
