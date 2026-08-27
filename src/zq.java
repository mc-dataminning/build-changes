import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record zq(List<zq.a> a) implements xg<zb> {
   private static final int b = 2097152;

   public zq(uj $$0) {
      this($$0.a(zq.a::new));
   }

   public static zq a(List<dlw> $$0) {
      return new zq($$0.stream().map(zq.a::new).toList());
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public static record a(cte a, byte[] b) {
      public a(dlw $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new uj(this.d()), $$0);
      }

      public a(uj $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dlw $$0) {
         int $$1 = 0;

         for (dlx $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public uj a() {
         return new uj(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(uj $$0, dlw $$1) {
         for (dlx $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(uj $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cte b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
