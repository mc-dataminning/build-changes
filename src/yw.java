import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record yw(List<yw.a> a) implements wo<yh> {
   private static final int b = 2097152;

   public yw(ty $$0) {
      this($$0.a(yw.a::new));
   }

   public static yw a(List<dju> $$0) {
      return new yw($$0.stream().map(yw.a::new).toList());
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public static record a(crm a, byte[] b) {
      public a(dju $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new ty(this.d()), $$0);
      }

      public a(ty $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dju $$0) {
         int $$1 = 0;

         for (djv $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public ty a() {
         return new ty(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(ty $$0, dju $$1) {
         for (djv $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(ty $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public crm b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
