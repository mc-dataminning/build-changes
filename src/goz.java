import java.util.Set;
import javax.annotation.Nullable;

public class goz implements gph.a {
   public static final ale a = gph.a;
   public static final ale b = ale.b("translucent");
   public static final ale c = ale.b("item_entity");
   public static final ale d = ale.b("particles");
   public static final ale e = ale.b("weather");
   public static final ale f = ale.b("clouds");
   public static final ale g = ale.b("entity_outline");
   public static final Set<ale> h = Set.of(a);
   public static final Set<ale> i = Set.of(a, g);
   public static final Set<ale> j = Set.of(a, b, c, d, e, f);
   public fic<fha> k = fic.a();
   @Nullable
   public fic<fha> l;
   @Nullable
   public fic<fha> m;
   @Nullable
   public fic<fha> n;
   @Nullable
   public fic<fha> o;
   @Nullable
   public fic<fha> p;
   @Nullable
   public fic<fha> q;

   @Override
   public void a(ale $$0, fic<fha> $$1) {
      if ($$0.equals(a)) {
         this.k = $$1;
      } else if ($$0.equals(b)) {
         this.l = $$1;
      } else if ($$0.equals(c)) {
         this.m = $$1;
      } else if ($$0.equals(d)) {
         this.n = $$1;
      } else if ($$0.equals(e)) {
         this.o = $$1;
      } else if ($$0.equals(f)) {
         this.p = $$1;
      } else {
         if (!$$0.equals(g)) {
            throw new IllegalArgumentException("No target with id " + $$0);
         }

         this.q = $$1;
      }
   }

   @Nullable
   @Override
   public fic<fha> a(ale $$0) {
      if ($$0.equals(a)) {
         return this.k;
      } else if ($$0.equals(b)) {
         return this.l;
      } else if ($$0.equals(c)) {
         return this.m;
      } else if ($$0.equals(d)) {
         return this.n;
      } else if ($$0.equals(e)) {
         return this.o;
      } else if ($$0.equals(f)) {
         return this.p;
      } else {
         return $$0.equals(g) ? this.q : null;
      }
   }

   public void a() {
      this.k = fic.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
