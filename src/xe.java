import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record xe(List<xe.a> a) implements uw<wo> {
   private static final int b = 2097152;

   public xe(sh $$0) {
      this($$0.a(xe.a::new));
   }

   public static xe a(List<dhf> $$0) {
      return new xe($$0.stream().map(xe.a::new).toList());
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public static record a(cor a, byte[] b) {
      public a(dhf $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new sh(this.d()), $$0);
      }

      public a(sh $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dhf $$0) {
         int $$1 = 0;

         for (dhg $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public sh a() {
         return new sh(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(sh $$0, dhf $$1) {
         for (dhg $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(sh $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cor b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
