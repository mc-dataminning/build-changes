import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record vf(List<vf.a> a) implements uo<ur> {
   private static final int b = 2097152;

   public vf(sf $$0) {
      this($$0.a(vf.a::new));
   }

   public static vf a(List<dei> $$0) {
      return new vf($$0.stream().map(vf.a::new).toList());
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public static record a(clt a, byte[] b) {
      public a(dei $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new sf(this.d()), $$0);
      }

      public a(sf $$0) {
         this($$0.g(), $$0.b(2097152));
      }

      private static int a(dei $$0) {
         int $$1 = 0;

         for (dej $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public sf a() {
         return new sf(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(sf $$0, dei $$1) {
         for (dej $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(sf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public clt b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
