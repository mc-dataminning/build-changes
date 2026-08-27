import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record xi(List<xi.a> a) implements va<ws> {
   private static final int b = 2097152;

   public xi(sl $$0) {
      this($$0.a(xi.a::new));
   }

   public static xi a(List<dhl> $$0) {
      return new xi($$0.stream().map(xi.a::new).toList());
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public static record a(cox a, byte[] b) {
      public a(dhl $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new sl(this.d()), $$0);
      }

      public a(sl $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dhl $$0) {
         int $$1 = 0;

         for (dhm $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public sl a() {
         return new sl(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(sl $$0, dhl $$1) {
         for (dhm $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(sl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cox b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
