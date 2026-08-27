import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zx(UUID c, String d, String e, boolean f, Optional<xe> g) implements zl<zr> {
   public static final int a = 40;
   public static final zc<ByteBuf, zx> b = zc.a(ju.g, zx::b, za.l, zx::e, za.b(40), zx::f, za.b, zx::g, xg.f.a(za::a), zx::h, zx::new);

   public zx(UUID c, String d, String e, boolean f, Optional<xe> g) {
      if (e.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + e.length() + ")");
      } else {
         this.c = c;
         this.d = d;
         this.e = e;
         this.f = f;
         this.g = g;
      }
   }

   @Override
   public zn<zx> a() {
      return aab.f;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }

   public UUID b() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public String f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }

   public Optional<xe> h() {
      return this.g;
   }
}
