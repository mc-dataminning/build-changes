import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record yz(UUID c, String d, String e, boolean f, Optional<wg> g) implements yn<yt> {
   public static final int a = 40;
   public static final ye<ByteBuf, yz> b = ye.a(jf.g, yz::b, yc.k, yz::e, yc.b(40), yz::f, yc.b, yz::g, wi.f.a(yc::a), yz::h, yz::new);

   public yz(UUID c, String d, String e, boolean f, Optional<wg> g) {
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
   public yp<yz> a() {
      return zd.f;
   }

   public void a(yt $$0) {
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

   public Optional<wg> h() {
      return this.g;
   }
}
