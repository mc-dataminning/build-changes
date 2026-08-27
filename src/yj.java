import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record yj(List<yj.a> a) implements wb<xu> {
   private static final int b = 2097152;

   public yj(tl $$0) {
      this($$0.a(yj.a::new));
   }

   public static yj a(List<dii> $$0) {
      return new yj($$0.stream().map(yj.a::new).toList());
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public static record a(cqg a, byte[] b) {
      public a(dii $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new tl(this.d()), $$0);
      }

      public a(tl $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dii $$0) {
         int $$1 = 0;

         for (dij $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public tl a() {
         return new tl(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(tl $$0, dii $$1) {
         for (dij $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(tl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cqg b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
