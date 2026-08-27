import java.util.Objects;
import javax.annotation.Nullable;

public class yf implements uo<ur> {
   private final String a;
   @Nullable
   private final String b;
   private final int c;
   private final adg.a d;

   public yf(adg.a $$0, @Nullable String $$1, String $$2, int $$3) {
      if ($$0 != adg.a.b && $$1 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.a = $$2;
         this.b = $$1;
         this.c = $$3;
         this.d = $$0;
      }
   }

   public yf(sf $$0) {
      this.a = $$0.s();
      this.d = $$0.b(adg.a.class);
      String $$1 = $$0.s();
      this.b = Objects.equals($$1, "") ? null : $$1;
      if (this.d != adg.a.b) {
         this.c = $$0.m();
      } else {
         this.c = 0;
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.a(this.d);
      $$0.a(this.b == null ? "" : this.b);
      if (this.d != adg.a.b) {
         $$0.d(this.c);
      }
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public String c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public adg.a e() {
      return this.d;
   }
}
