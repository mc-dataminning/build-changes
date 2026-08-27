import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class lv extends lp implements lr {
   private final ls b;
   private final cjg c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, cmm> f = Maps.newLinkedHashMap();
   private final Map<String, am<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public lv(ls $$0, cqa $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static lv a(ls $$0, cqa $$1) {
      return a($$0, $$1, 1);
   }

   public static lv a(ls $$0, cqa $$1, int $$2) {
      return new lv($$0, $$1, $$2);
   }

   public lv a(Character $$0, aqk<cjg> $$1) {
      return this.a($$0, cmm.a($$1));
   }

   public lv a(Character $$0, cqa $$1) {
      return this.a($$0, cmm.a($$1));
   }

   public lv a(Character $$0, cmm $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public lv b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public lv b(String $$0, am<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public lv c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public lv a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cjg a() {
      return this.c;
   }

   @Override
   public void a(lt $$0, aez $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.g.forEach($$2::a);
      $$0.a(new lv.a($$1, this.c, this.d, this.h == null ? "" : this.h, a(this.b), this.e, this.f, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.i));
   }

   private void a(aez $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No pattern is defined for shaped recipe " + $$0 + "!");
      } else {
         Set<Character> $$1 = Sets.newHashSet(this.f.keySet());
         $$1.remove(' ');

         for (String $$2 : this.e) {
            for (int $$3 = 0; $$3 < $$2.length(); $$3++) {
               char $$4 = $$2.charAt($$3);
               if (!this.f.containsKey($$4) && $$4 != ' ') {
                  throw new IllegalStateException("Pattern in recipe " + $$0 + " uses undefined symbol '" + $$4 + "'");
               }

               $$1.remove($$4);
            }
         }

         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + $$0);
         } else if (this.e.size() == 1 && this.e.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + $$0 + " only takes in a single item - should it be a shapeless recipe instead?");
         } else if (this.g.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + $$0);
         }
      }
   }

   static class a extends lp.a {
      private final aez a;
      private final cjg b;
      private final int c;
      private final String d;
      private final List<String> e;
      private final Map<Character, cmm> f;
      private final af g;
      private final boolean h;

      public a(aez $$0, cjg $$1, int $$2, String $$3, cme $$4, List<String> $$5, Map<Character, cmm> $$6, af $$7, boolean $$8) {
         super($$4);
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$5;
         this.f = $$6;
         this.g = $$7;
         this.h = $$8;
      }

      @Override
      public void a(JsonObject $$0) {
         super.a($$0);
         if (!this.d.isEmpty()) {
            $$0.addProperty("group", this.d);
         }

         JsonArray $$1 = new JsonArray();

         for (String $$2 : this.e) {
            $$1.add($$2);
         }

         $$0.add("pattern", $$1);
         JsonObject $$3 = new JsonObject();

         for (Entry<Character, cmm> $$4 : this.f.entrySet()) {
            $$3.add(String.valueOf($$4.getKey()), $$4.getValue().a(false));
         }

         $$0.add("key", $$3);
         JsonObject $$5 = new JsonObject();
         $$5.addProperty("item", jb.i.b(this.b).toString());
         if (this.c > 1) {
            $$5.addProperty("count", this.c);
         }

         $$0.add("result", $$5);
         $$0.addProperty("show_notification", this.h);
      }

      @Override
      public cms<?> c() {
         return cms.a;
      }

      @Override
      public aez b() {
         return this.a;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
