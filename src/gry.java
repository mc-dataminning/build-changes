import java.util.Set;
import javax.annotation.Nullable;

public class gry implements gsg.a {
   public static final alk a = gsg.a;
   public static final alk b = alk.b("translucent");
   public static final alk c = alk.b("item_entity");
   public static final alk d = alk.b("particles");
   public static final alk e = alk.b("weather");
   public static final alk f = alk.b("clouds");
   public static final alk g = alk.b("entity_outline");
   public static final Set<alk> h = Set.of(a);
   public static final Set<alk> i = Set.of(a, g);
   public static final Set<alk> j = Set.of(a, b, c, d, e, f);
   public fkv<fjs> k = fkv.a();
   @Nullable
   public fkv<fjs> l;
   @Nullable
   public fkv<fjs> m;
   @Nullable
   public fkv<fjs> n;
   @Nullable
   public fkv<fjs> o;
   @Nullable
   public fkv<fjs> p;
   @Nullable
   public fkv<fjs> q;

   @Override
   public void a(alk $$0, fkv<fjs> $$1) {
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
   public fkv<fjs> a(alk $$0) {
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
      this.k = fkv.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
