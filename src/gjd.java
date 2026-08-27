import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gjd implements git {
   protected final List<fwi> a;
   protected final Map<ie, List<fwi>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final ggt f;
   protected final fwu g;
   protected final fws h;

   public gjd(List<fwi> $$0, Map<ie, List<fwi>> $$1, boolean $$2, boolean $$3, boolean $$4, ggt $$5, fwu $$6, fws $$7) {
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
   public List<fwi> a(@Nullable dlf $$0, @Nullable ie $$1, awo $$2) {
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
   public ggt e() {
      return this.f;
   }

   @Override
   public fwu f() {
      return this.g;
   }

   @Override
   public fws g() {
      return this.h;
   }

   public static class a {
      private final List<fwi> a = Lists.newArrayList();
      private final Map<ie, List<fwi>> b = Maps.newEnumMap(ie.class);
      private final fws c;
      private final boolean d;
      private ggt e;
      private final boolean f;
      private final boolean g;
      private final fwu h;

      public a(fwn $$0, fws $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fwu $$3, fws $$4) {
         for (ie $$5 : ie.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gjd.a a(ie $$0, fwi $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gjd.a a(fwi $$0) {
         this.a.add($$0);
         return this;
      }

      public gjd.a a(ggt $$0) {
         this.e = $$0;
         return this;
      }

      public gjd.a a() {
         return this;
      }

      public git b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gjd(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
