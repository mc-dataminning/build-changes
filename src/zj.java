import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zj(UUID c, String d, String e, boolean f, Optional<wp> g) implements yw<zc> {
   public static final int a = 40;
   public static final yn<ByteBuf, zj> b = yn.a(kl.g, zj::b, yl.o, zj::e, yl.b(40), zj::f, yl.b, zj::g, wr.f.a(yl::a), zj::h, zj::new);

   public zj(UUID c, String d, String e, boolean f, Optional<wp> g) {
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
   public yy<zj> a() {
      return zo.g;
   }

   public void a(zc $$0) {
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

   public Optional<wp> h() {
      return this.g;
   }
}
