import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zi(UUID c, String d, String e, boolean f, Optional<wo> g) implements yv<zb> {
   public static final int a = 40;
   public static final ym<ByteBuf, zi> b = ym.a(kl.g, zi::b, yk.o, zi::e, yk.b(40), zi::f, yk.b, zi::g, wq.f.a(yk::a), zi::h, zi::new);

   public zi(UUID c, String d, String e, boolean f, Optional<wo> g) {
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
   public yx<zi> a() {
      return zn.g;
   }

   public void a(zb $$0) {
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

   public Optional<wo> h() {
      return this.g;
   }
}
