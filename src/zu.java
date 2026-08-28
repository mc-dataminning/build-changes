import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zu(UUID c, String d, String e, boolean f, Optional<xa> g) implements zh<zn> {
   public static final int a = 40;
   public static final yy<ByteBuf, zu> b = yy.a(jz.g, zu::b, yw.p, zu::e, yw.b(40), zu::f, yw.b, zu::g, xc.f.a(yw::a), zu::h, zu::new);

   public zu(UUID c, String d, String e, boolean f, Optional<xa> g) {
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
   public zj<zu> a() {
      return zz.g;
   }

   public void a(zn $$0) {
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

   public Optional<xa> h() {
      return this.g;
   }
}
