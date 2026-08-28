import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hjp extends aut<hjp.a> {
   public static final aku a = aku.b("empty");
   public static final hig b = new hig(a, brj.a(1.0F), brj.a(1.0F), 1, hig.a.a, false, false, 16);
   public static final aku c = aku.b("intentionally_empty");
   public static final hjq d = new hjq(c, null);
   public static final hig e = new hig(c, brj.a(1.0F), brj.a(1.0F), 1, hig.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wo.class, new wo.b(kf.b)).registerTypeAdapter(hih.class, new hii()).create();
   private static final TypeToken<Map<String, hih>> i = new TypeToken<Map<String, hih>>() {
   };
   private final Map<aku, hjq> j = Maps.newHashMap();
   private final hjm k;
   private final Map<aku, aum> l = new HashMap<>();

   public hjp(fll $$0) {
      this.k = new hjm(this, $$0, aur.fromMap(this.l));
   }

   protected hjp.a a(auo $$0, bor $$1) {
      hjp.a $$2 = new hjp.a();

      try (bow $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bow $$5 = $$1.d($$4)) {
            for (aum $$7 : $$0.a(aku.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hih> $$9 = ayo.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hih> $$10 : $$9.entrySet()) {
                     $$2.a(aku.a($$4, $$10.getKey()), $$10.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var19) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$7.b(), var19});
               }

               $$1.c();
            }
         } catch (IOException var21) {
         }
      }

      return $$2;
   }

   protected void a(hjp.a $$0, auo $$1, bor $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (aku $$3 : this.j.keySet()) {
            hjq $$4 = this.j.get($$3);
            if (!wr.b($$4.a()) && mb.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (aku $$5 : this.j.keySet()) {
            if (!mb.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fdh b() {
      return this.k.i();
   }

   static boolean a(hig $$0, aku $$1, aur $$2) {
      aku $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hjq a(aku $$0) {
      return this.j.get($$0);
   }

   public Collection<aku> d() {
      return this.j.keySet();
   }

   public void a(hik $$0) {
      this.k.a($$0);
   }

   public void a(hij $$0) {
      this.k.c($$0);
   }

   public void a(hij $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fkp $$0) {
      this.k.a($$0);
   }

   public void e() {
      this.k.e();
   }

   public void f() {
      this.k.d();
   }

   public void g() {
      this.k.b();
   }

   public void h() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void i() {
      this.k.f();
   }

   public void a(awa $$0, float $$1) {
      if ($$0 == awa.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hij $$0) {
      this.k.a($$0);
   }

   public void a(hij $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hij $$0) {
      return this.k.b($$0);
   }

   public void a(hjo $$0) {
      this.k.a($$0);
   }

   public void b(hjo $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable aku $$0, @Nullable awa $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<aku, hjq> a = Maps.newHashMap();
      private Map<aku, aum> b = Map.of();

      void a(auo $$0) {
         this.b = hig.a.a($$0);
      }

      void a(aku $$0, hih $$1) {
         hjq $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hjp.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hjq($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aur $$4 = aur.fromMap(this.b);

         for (final hig $$5 : $$1.a()) {
            final aku $$6 = $$5.a();
            hjr<hig> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hjp.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hjr<hig>() {
                     @Override
                     public int e() {
                        hjq $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hig a(azg $$0) {
                        hjq $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hjp.b;
                        } else {
                           hig $$2 = $$1.a($$0);
                           return new hig($$2.a(), new brp($$2.c(), $$5.c()), new brp($$2.d(), $$5.d()), $$5.e(), hig.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hjm $$0) {
                        hjq $$1 = a.this.a.get($$6);
                        if ($$1 != null) {
                           $$1.a($$0);
                        }
                     }
                  };
                  break;
               default:
                  throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
            }

            $$2.a($$8);
         }
      }

      public void a(Map<aku, hjq> $$0, Map<aku, aum> $$1, hjm $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aku, hjq> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
