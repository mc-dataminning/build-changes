import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record ys(List<ys.a> a) implements wk<yd> {
   private static final int b = 2097152;

   public ys(tu $$0) {
      this($$0.a(ys.a::new));
   }

   public static ys a(List<djd> $$0) {
      return new ys($$0.stream().map(ys.a::new).toList());
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public static record a(cqz a, byte[] b) {
      public a(djd $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new tu(this.d()), $$0);
      }

      public a(tu $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(djd $$0) {
         int $$1 = 0;

         for (dje $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public tu a() {
         return new tu(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(tu $$0, djd $$1) {
         for (dje $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(tu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cqz b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
