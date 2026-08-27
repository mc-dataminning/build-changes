import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record zd(List<zd.a> a) implements wu<yo> {
   private static final int b = 2097152;

   public zd(ue $$0) {
      this($$0.a(zd.a::new));
   }

   public static zd a(List<dkw> $$0) {
      return new zd($$0.stream().map(zd.a::new).toList());
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public static record a(csf a, byte[] b) {
      public a(dkw $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new ue(this.d()), $$0);
      }

      public a(ue $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dkw $$0) {
         int $$1 = 0;

         for (dkx $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public ue a() {
         return new ue(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(ue $$0, dkw $$1) {
         for (dkx $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(ue $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public csf b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
