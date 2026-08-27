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

public class ggg extends apm<ggg.a> {
   public static final gez a = new gez("minecraft:empty", bhy.a(1.0F), bhy.a(1.0F), 1, gez.a.a, false, false, 16);
   public static final agi b = new agi("minecraft", "intentionally_empty");
   public static final ggh c = new ggh(b, null);
   public static final gez d = new gez(b.toString(), bhy.a(1.0F), bhy.a(1.0F), 1, gez.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(ur.class, new ur.b()).registerTypeAdapter(gfa.class, new gfb()).create();
   private static final TypeToken<Map<String, gfa>> h = new TypeToken<Map<String, gfa>>() {
   };
   private final Map<agi, ggh> i = Maps.newHashMap();
   private final ggd j;
   private final Map<agi, apf> k = new HashMap<>();

   public ggg(eth $$0) {
      this.j = new ggd(this, $$0, apk.fromMap(this.k));
   }

   protected ggg.a a(aph $$0, bfo $$1) {
      ggg.a $$2 = new ggg.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (apf $$5 : $$0.a(new agi($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gfa> $$7 = atc.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gfa> $$8 : $$7.entrySet()) {
                     $$2.a(new agi($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  e.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
               }

               $$1.c();
            }
         } catch (IOException var16) {
         }

         $$1.c();
      }

      $$1.b();
      return $$2;
   }

   protected void a(ggg.a $$0, aph $$1, bfo $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aT) {
         for (agi $$3 : this.i.keySet()) {
            ggh $$4 = this.i.get($$3);
            if (!uu.b($$4.a()) && jy.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (agi $$5 : this.i.keySet()) {
            if (!jy.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   static boolean a(gez $$0, agi $$1, apk $$2) {
      agi $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public ggh a(agi $$0) {
      return this.i.get($$0);
   }

   public Collection<agi> b() {
      return this.i.keySet();
   }

   public void a(gfd $$0) {
      this.j.a($$0);
   }

   public void a(gfc $$0) {
      this.j.c($$0);
   }

   public void a(gfc $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eso $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.e();
   }

   public void e() {
      this.j.d();
   }

   public void f() {
      this.j.b();
   }

   public void g() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void h() {
      this.j.f();
   }

   public void a(aqs $$0, float $$1) {
      if ($$0 == aqs.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gfc $$0) {
      this.j.a($$0);
   }

   public boolean c(gfc $$0) {
      return this.j.b($$0);
   }

   public void a(ggf $$0) {
      this.j.a($$0);
   }

   public void b(ggf $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable agi $$0, @Nullable aqs $$1) {
      this.j.a($$0, $$1);
   }

   public String i() {
      return this.j.g();
   }

   public void j() {
      this.j.a();
   }

   protected static class a {
      final Map<agi, ggh> a = Maps.newHashMap();
      private Map<agi, apf> b = Map.of();

      void a(aph $$0) {
         this.b = gez.a.a($$0);
      }

      void a(agi $$0, gfa $$1) {
         ggh $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               ggg.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new ggh($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         apk $$4 = apk.fromMap(this.b);

         for (final gez $$5 : $$1.a()) {
            final agi $$6 = $$5.a();
            ggi<gez> $$8;
            switch ($$5.f()) {
               case a:
                  if (!ggg.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new ggi<gez>() {
                     @Override
                     public int e() {
                        ggh $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gez a(ats $$0) {
                        ggh $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return ggg.a;
                        } else {
                           gez $$2 = $$1.a($$0);
                           return new gez(
                              $$2.a().toString(), new bie($$2.c(), $$5.c()), new bie($$2.d(), $$5.d()), $$5.e(), gez.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(ggd $$0) {
                        ggh $$1 = a.this.a.get($$6);
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

      public void a(Map<agi, ggh> $$0, Map<agi, apf> $$1, ggd $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<agi, ggh> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
