import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fxb implements fwr {
   protected final List<fkr> a;
   protected final Map<ha, List<fkr>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final fuv f;
   protected final fld g;
   protected final flb h;

   public fxb(List<fkr> $$0, Map<ha, List<fkr>> $$1, boolean $$2, boolean $$3, boolean $$4, fuv $$5, fld $$6, flb $$7) {
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
   public List<fkr> a(@Nullable dcb $$0, @Nullable ha $$1, apf $$2) {
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
   public fuv e() {
      return this.f;
   }

   @Override
   public fld f() {
      return this.g;
   }

   @Override
   public flb g() {
      return this.h;
   }

   public static class a {
      private final List<fkr> a = Lists.newArrayList();
      private final Map<ha, List<fkr>> b = Maps.newEnumMap(ha.class);
      private final flb c;
      private final boolean d;
      private fuv e;
      private final boolean f;
      private final boolean g;
      private final fld h;

      public a(fkw $$0, flb $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fld $$3, flb $$4) {
         for (ha $$5 : ha.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public fxb.a a(ha $$0, fkr $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public fxb.a a(fkr $$0) {
         this.a.add($$0);
         return this;
      }

      public fxb.a a(fuv $$0) {
         this.e = $$0;
         return this;
      }

      public fxb.a a() {
         return this;
      }

      public fwr b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new fxb(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
