import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record zm(List<zm.a> a) implements xd<yx> {
   private static final int b = 2097152;

   public zm(ug $$0) {
      this($$0.a(zm.a::new));
   }

   public static zm a(List<dlh> $$0) {
      return new zm($$0.stream().map(zm.a::new).toList());
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public static record a(csp a, byte[] b) {
      public a(dlh $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new ug(this.d()), $$0);
      }

      public a(ug $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dlh $$0) {
         int $$1 = 0;

         for (dli $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public ug a() {
         return new ug(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(ug $$0, dlh $$1) {
         for (dli $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(ug $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public csp b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
