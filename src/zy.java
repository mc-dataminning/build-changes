import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zy(UUID c, String d, String e, boolean f, Optional<xe> g) implements zl<zr> {
   public static final int a = 40;
   public static final zc<ByteBuf, zy> b = zc.a(ki.g, zy::b, za.m, zy::e, za.b(40), zy::f, za.b, zy::g, xg.f.a(za::a), zy::h, zy::new);

   public zy(UUID c, String d, String e, boolean f, Optional<xe> g) {
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
   public zn<zy> a() {
      return aad.g;
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
