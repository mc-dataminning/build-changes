import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record zp(List<zp.a> a) implements xf<za> {
   private static final int b = 2097152;

   public zp(ui $$0) {
      this($$0.a(zp.a::new));
   }

   public static zp a(List<dlo> $$0) {
      return new zp($$0.stream().map(zp.a::new).toList());
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public static record a(csw a, byte[] b) {
      public a(dlo $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new ui(this.d()), $$0);
      }

      public a(ui $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dlo $$0) {
         int $$1 = 0;

         for (dlp $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public ui a() {
         return new ui(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(ui $$0, dlo $$1) {
         for (dlp $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(ui $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public csw b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
