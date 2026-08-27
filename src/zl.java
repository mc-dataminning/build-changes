import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zl(UUID c, String d, String e, boolean f, Optional<ws> g) implements yz<zf> {
   public static final int a = 40;
   public static final yq<ByteBuf, zl> b = yq.a(jp.g, zl::b, yo.k, zl::e, yo.b(40), zl::f, yo.b, zl::g, wu.f.a(yo::a), zl::h, zl::new);

   public zl(UUID c, String d, String e, boolean f, Optional<ws> g) {
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
   public zb<zl> a() {
      return zp.f;
   }

   public void a(zf $$0) {
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

   public Optional<ws> h() {
      return this.g;
   }
}
