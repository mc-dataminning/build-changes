import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zx(UUID c, String d, String e, boolean f, Optional<xd> g) implements zk<zq> {
   public static final int a = 40;
   public static final zb<ByteBuf, zx> b = zb.a(kh.g, zx::b, yz.l, zx::e, yz.b(40), zx::f, yz.b, zx::g, xf.f.a(yz::a), zx::h, zx::new);

   public zx(UUID c, String d, String e, boolean f, Optional<xd> g) {
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
   public zm<zx> a() {
      return aac.g;
   }

   public void a(zq $$0) {
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

   public Optional<xd> h() {
      return this.g;
   }
}
