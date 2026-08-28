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

public class guj extends aub<guj.a> {
   public static final gtb a = new gtb("minecraft:empty", bpi.a(1.0F), bpi.a(1.0F), 1, gtb.a.a, false, false, 16);
   public static final akk b = new akk("minecraft", "intentionally_empty");
   public static final guk c = new guk(b, null);
   public static final gtb d = new gtb(b.toString(), bpi.a(1.0F), bpi.a(1.0F), 1, gtb.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(wu.class, new wu.b(jx.b)).registerTypeAdapter(gtc.class, new gtd()).create();
   private static final TypeToken<Map<String, gtc>> h = new TypeToken<Map<String, gtc>>() {
   };
   private final Map<akk, guk> i = Maps.newHashMap();
   private final gug j;
   private final Map<akk, atu> k = new HashMap<>();

   public guj(fga $$0) {
      this.j = new gug(this, $$0, atz.fromMap(this.k));
   }

   protected guj.a a(atw $$0, bmv $$1) {
      guj.a $$2 = new guj.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (atu $$5 : $$0.a(new akk($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gtc> $$7 = axw.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gtc> $$8 : $$7.entrySet()) {
                     $$2.a(new akk($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(guj.a $$0, atw $$1, bmv $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aU) {
         for (akk $$3 : this.i.keySet()) {
            guk $$4 = this.i.get($$3);
            if (!wx.b($$4.a()) && lq.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (akk $$5 : this.i.keySet()) {
            if (!lq.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public eym b() {
      return this.j.i();
   }

   static boolean a(gtb $$0, akk $$1, atz $$2) {
      akk $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public guk a(akk $$0) {
      return this.i.get($$0);
   }

   public Collection<akk> d() {
      return this.i.keySet();
   }

   public void a(gtf $$0) {
      this.j.a($$0);
   }

   public void a(gte $$0) {
      this.j.c($$0);
   }

   public void a(gte $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(ffg $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.e();
   }

   public void f() {
      this.j.d();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void i() {
      this.j.f();
   }

   public void a(avi $$0, float $$1) {
      if ($$0 == avi.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gte $$0) {
      this.j.a($$0);
   }

   public boolean c(gte $$0) {
      return this.j.b($$0);
   }

   public void a(gui $$0) {
      this.j.a($$0);
   }

   public void b(gui $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable akk $$0, @Nullable avi $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<akk, guk> a = Maps.newHashMap();
      private Map<akk, atu> b = Map.of();

      void a(atw $$0) {
         this.b = gtb.a.a($$0);
      }

      void a(akk $$0, gtc $$1) {
         guk $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               guj.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new guk($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         atz $$4 = atz.fromMap(this.b);

         for (final gtb $$5 : $$1.a()) {
            final akk $$6 = $$5.a();
            gul<gtb> $$8;
            switch ($$5.f()) {
               case a:
                  if (!guj.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gul<gtb>() {
                     @Override
                     public int e() {
                        guk $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gtb a(ayo $$0) {
                        guk $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return guj.a;
                        } else {
                           gtb $$2 = $$1.a($$0);
                           return new gtb(
                              $$2.a().toString(), new bpo($$2.c(), $$5.c()), new bpo($$2.d(), $$5.d()), $$5.e(), gtb.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gug $$0) {
                        guk $$1 = a.this.a.get($$6);
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

      public void a(Map<akk, guk> $$0, Map<akk, atu> $$1, gug $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akk, guk> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
