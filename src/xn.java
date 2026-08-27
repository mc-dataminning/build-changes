import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record xn(List<xn.a> a) implements vf<wy> {
   private static final int b = 2097152;

   public xn(sq $$0) {
      this($$0.a(xn.a::new));
   }

   public static xn a(List<dhs> $$0) {
      return new xn($$0.stream().map(xn.a::new).toList());
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public static record a(cpe a, byte[] b) {
      public a(dhs $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new sq(this.d()), $$0);
      }

      public a(sq $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dhs $$0) {
         int $$1 = 0;

         for (dht $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public sq a() {
         return new sq(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(sq $$0, dhs $$1) {
         for (dht $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(sq $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cpe b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
