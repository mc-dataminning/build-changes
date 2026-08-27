import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gds implements gdi {
   protected final List<fre> a;
   protected final Map<hx, List<fre>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gbh f;
   protected final frq g;
   protected final fro h;

   public gds(List<fre> $$0, Map<hx, List<fre>> $$1, boolean $$2, boolean $$3, boolean $$4, gbh $$5, frq $$6, fro $$7) {
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
   public List<fre> a(@Nullable dgw $$0, @Nullable hx $$1, ato $$2) {
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
   public gbh e() {
      return this.f;
   }

   @Override
   public frq f() {
      return this.g;
   }

   @Override
   public fro g() {
      return this.h;
   }

   public static class a {
      private final List<fre> a = Lists.newArrayList();
      private final Map<hx, List<fre>> b = Maps.newEnumMap(hx.class);
      private final fro c;
      private final boolean d;
      private gbh e;
      private final boolean f;
      private final boolean g;
      private final frq h;

      public a(frj $$0, fro $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, frq $$3, fro $$4) {
         for (hx $$5 : hx.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gds.a a(hx $$0, fre $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gds.a a(fre $$0) {
         this.a.add($$0);
         return this;
      }

      public gds.a a(gbh $$0) {
         this.e = $$0;
         return this;
      }

      public gds.a a() {
         return this;
      }

      public gdi b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gds(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
