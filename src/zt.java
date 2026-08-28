import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zt(UUID c, String d, String e, boolean f, Optional<wz> g) implements zg<zm> {
   public static final int a = 40;
   public static final yx<ByteBuf, zt> b = yx.a(kg.g, zt::b, yv.l, zt::e, yv.b(40), zt::f, yv.b, zt::g, xb.f.a(yv::a), zt::h, zt::new);

   public zt(UUID c, String d, String e, boolean f, Optional<wz> g) {
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
   public zi<zt> a() {
      return zy.g;
   }

   public void a(zm $$0) {
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

   public Optional<wz> h() {
      return this.g;
   }
}
