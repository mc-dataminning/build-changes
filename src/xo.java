import java.util.UUID;
import javax.annotation.Nullable;

public record xo(UUID b, String c, String d, boolean e, @Nullable vf f) implements xf<xi> {
   public static final int a = 40;

   public xo(UUID b, String c, String d, boolean e, @Nullable vf f) {
      if (d.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + d.length() + ")");
      } else {
         this.b = b;
         this.c = c;
         this.d = d;
         this.e = e;
         this.f = f;
      }
   }

   public xo(ui $$0) {
      this($$0.p(), $$0.s(), $$0.d(40), $$0.readBoolean(), $$0.c(ui::m));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f, ui::a);
   }

   public void a(xi $$0) {
      $$0.a(this);
   }

   public UUID a() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   @Nullable
   public vf g() {
      return this.f;
   }
}
