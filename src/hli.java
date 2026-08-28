import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hli implements hkp {
   public static final String a = "particle";
   private final List<gqz> b;
   private final Map<ja, List<gqz>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final hip g;
   private final grj h;

   public hli(List<gqz> $$0, Map<ja, List<gqz>> $$1, boolean $$2, boolean $$3, boolean $$4, hip $$5, grj $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hkp a(List<gra> $$0, grl $$1, hlj $$2, hlf $$3, boolean $$4, boolean $$5, boolean $$6, grj $$7) {
      hip $$8 = a($$2, $$1, "particle");
      hli.a $$9 = new hli.a($$4, $$5, $$6, $$7).a($$8);

      for (gra $$10 : $$0) {
         for (ja $$11 : $$10.c.keySet()) {
            grb $$12 = $$10.c.get($$11);
            hip $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(ja.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static gqz a(gra $$0, grb $$1, hip $$2, ja $$3, hlf $$4) {
      return grg.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static hip a(hlj $$0, grl $$1, String $$2) {
      hkw $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<gqz> a(@Nullable dzz $$0, @Nullable ja $$1, azv $$2) {
      return $$1 == null ? this.b : this.c.get($$1);
   }

   @Override
   public boolean a() {
      return this.d;
   }

   @Override
   public boolean b() {
      return this.e;
   }

   @Override
   public boolean c() {
      return this.f;
   }

   @Override
   public hip d() {
      return this.g;
   }

   @Override
   public grj e() {
      return this.h;
   }

   public static class a {
      private final Builder<gqz> a = ImmutableList.builder();
      private final Map<ja, Builder<gqz>> b = af.a(ja.class, $$0x -> ImmutableList.builder());
      private final boolean c;
      @Nullable
      private hip d;
      private final boolean e;
      private final boolean f;
      private final grj g;

      public a(boolean $$0, boolean $$1, boolean $$2, grj $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
      }

      public hli.a a(ja $$0, gqz $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hli.a a(gqz $$0) {
         this.a.add($$0);
         return this;
      }

      public hli.a a(hip $$0) {
         this.d = $$0;
         return this;
      }

      public hli.a a() {
         return this;
      }

      public hkp b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<ja, List<gqz>> $$0 = af.a(this.b, Builder::build);
            return new hli(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}
