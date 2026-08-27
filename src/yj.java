import java.util.UUID;
import javax.annotation.Nullable;

public record yj(UUID c, String d, String e, boolean f, @Nullable vq g) implements xx<yd> {
   public static final xo<uq, yj> a = xx.a(yj::a, yj::new);
   public static final int b = 40;

   public yj(UUID c, String d, String e, boolean f, @Nullable vq g) {
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

   private yj(uq $$0) {
      this($$0.p(), $$0.r(), $$0.d(40), $$0.readBoolean(), $$0.c(uq::m));
   }

   private void a(uq $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g, uq::a);
   }

   @Override
   public xz<yj> a() {
      return yn.f;
   }

   public void a(yd $$0) {
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

   @Nullable
   public vq h() {
      return this.g;
   }
}
