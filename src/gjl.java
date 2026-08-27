import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gjl implements gjb {
   protected final List<fwq> a;
   protected final Map<ie, List<fwq>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final ghb f;
   protected final fxc g;
   protected final fxa h;

   public gjl(List<fwq> $$0, Map<ie, List<fwq>> $$1, boolean $$2, boolean $$3, boolean $$4, ghb $$5, fxc $$6, fxa $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<fwq> a(@Nullable dlj $$0, @Nullable ie $$1, awp $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public ghb e() {
      return this.f;
   }

   @Override
   public fxc f() {
      return this.g;
   }

   @Override
   public fxa g() {
      return this.h;
   }

   public static class a {
      private final List<fwq> a = Lists.newArrayList();
      private final Map<ie, List<fwq>> b = Maps.newEnumMap(ie.class);
      private final fxa c;
      private final boolean d;
      private ghb e;
      private final boolean f;
      private final boolean g;
      private final fxc h;

      public a(fwv $$0, fxa $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fxc $$3, fxa $$4) {
         for (ie $$5 : ie.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gjl.a a(ie $$0, fwq $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gjl.a a(fwq $$0) {
         this.a.add($$0);
         return this;
      }

      public gjl.a a(ghb $$0) {
         this.e = $$0;
         return this;
      }

      public gjl.a a() {
         return this;
      }

      public gjb b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gjl(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
