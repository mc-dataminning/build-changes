import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class glj implements gkz {
   protected final List<fyn> a;
   protected final Map<ih, List<fyn>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final giz f;
   protected final fyz g;
   protected final fyx h;

   public glj(List<fyn> $$0, Map<ih, List<fyn>> $$1, boolean $$2, boolean $$3, boolean $$4, giz $$5, fyz $$6, fyx $$7) {
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
   public List<fyn> a(@Nullable dmz $$0, @Nullable ih $$1, axd $$2) {
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
   public giz e() {
      return this.f;
   }

   @Override
   public fyz f() {
      return this.g;
   }

   @Override
   public fyx g() {
      return this.h;
   }

   public static class a {
      private final List<fyn> a = Lists.newArrayList();
      private final Map<ih, List<fyn>> b = Maps.newEnumMap(ih.class);
      private final fyx c;
      private final boolean d;
      private giz e;
      private final boolean f;
      private final boolean g;
      private final fyz h;

      public a(fys $$0, fyx $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fyz $$3, fyx $$4) {
         for (ih $$5 : ih.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public glj.a a(ih $$0, fyn $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public glj.a a(fyn $$0) {
         this.a.add($$0);
         return this;
      }

      public glj.a a(giz $$0) {
         this.e = $$0;
         return this;
      }

      public glj.a a() {
         return this;
      }

      public gkz b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new glj(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
