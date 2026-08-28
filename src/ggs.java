import java.util.Set;
import javax.annotation.Nullable;

public class ggs implements ggy.a {
   public static final alb a = ggy.a;
   public static final alb b = alb.b("translucent");
   public static final alb c = alb.b("item_entity");
   public static final alb d = alb.b("particles");
   public static final alb e = alb.b("weather");
   public static final alb f = alb.b("clouds");
   public static final alb g = alb.b("entity_outline");
   public static final Set<alb> h = Set.of(a, b, c, d, e, f);
   public fcb<faz> i = fcb.a();
   @Nullable
   public fcb<faz> j;
   @Nullable
   public fcb<faz> k;
   @Nullable
   public fcb<faz> l;
   @Nullable
   public fcb<faz> m;
   @Nullable
   public fcb<faz> n;
   @Nullable
   public fcb<faz> o;

   @Override
   public void a(alb $$0, fcb<faz> $$1) {
      if ($$0.equals(a)) {
         this.i = $$1;
      } else if ($$0.equals(b)) {
         this.j = $$1;
      } else if ($$0.equals(c)) {
         this.k = $$1;
      } else if ($$0.equals(d)) {
         this.l = $$1;
      } else if ($$0.equals(e)) {
         this.m = $$1;
      } else if ($$0.equals(f)) {
         this.n = $$1;
      } else {
         if (!$$0.equals(g)) {
            throw new IllegalArgumentException("No target with id " + $$0);
         }

         this.o = $$1;
      }
   }

   @Nullable
   @Override
   public fcb<faz> a(alb $$0) {
      if ($$0.equals(a)) {
         return this.i;
      } else if ($$0.equals(b)) {
         return this.j;
      } else if ($$0.equals(c)) {
         return this.k;
      } else if ($$0.equals(d)) {
         return this.l;
      } else if ($$0.equals(e)) {
         return this.m;
      } else if ($$0.equals(f)) {
         return this.n;
      } else {
         return $$0.equals(g) ? this.o : null;
      }
   }

   public void a() {
      this.i = fcb.a();
      this.j = null;
      this.k = null;
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
   }
}
