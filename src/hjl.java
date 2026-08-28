import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hjl implements his {
   public static final String a = "particle";
   private final List<gpf> b;
   private final Map<jo, List<gpf>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final hgs g;
   private final gpp h;

   public hjl(List<gpf> $$0, Map<jo, List<gpf>> $$1, boolean $$2, boolean $$3, boolean $$4, hgs $$5, gpp $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static his a(List<gpg> $$0, gpr $$1, hjm $$2, hji $$3, boolean $$4, boolean $$5, boolean $$6, gpp $$7) {
      hgs $$8 = a($$2, $$1, "particle");
      hjl.a $$9 = new hjl.a($$4, $$5, $$6, $$7).a($$8);

      for (gpg $$10 : $$0) {
         for (jo $$11 : $$10.c.keySet()) {
            gph $$12 = $$10.c.get($$11);
            hgs $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(jo.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static gpf a(gpg $$0, gph $$1, hgs $$2, jo $$3, hji $$4) {
      return gpm.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static hgs a(hjm $$0, gpr $$1, String $$2) {
      hiz $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<gpf> a(@Nullable dym $$0, @Nullable jo $$1, azs $$2) {
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
   public hgs d() {
      return this.g;
   }

   @Override
   public gpp e() {
      return this.h;
   }

   public static class a {
      private final Builder<gpf> a = ImmutableList.builder();
      private final Map<jo, Builder<gpf>> b = af.a(jo.class, $$0x -> ImmutableList.builder());
      private final boolean c;
      @Nullable
      private hgs d;
      private final boolean e;
      private final boolean f;
      private final gpp g;

      public a(boolean $$0, boolean $$1, boolean $$2, gpp $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
      }

      public hjl.a a(jo $$0, gpf $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hjl.a a(gpf $$0) {
         this.a.add($$0);
         return this;
      }

      public hjl.a a(hgs $$0) {
         this.d = $$0;
         return this;
      }

      public hjl.a a() {
         return this;
      }

      public his b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jo, List<gpf>> $$0 = af.a(this.b, Builder::build);
            return new hjl(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}
