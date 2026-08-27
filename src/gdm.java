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

public class gdm extends aob<gdm.a> {
   public static final gcf a = new gcf("minecraft:empty", bgf.a(1.0F), bgf.a(1.0F), 1, gcf.a.a, false, false, 16);
   public static final aez b = new aez("minecraft", "intentionally_empty");
   public static final gdn c = new gdn(b, null);
   public static final gcf d = new gcf(b.toString(), bgf.a(1.0F), bgf.a(1.0F), 1, gcf.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(tl.class, new tl.b()).registerTypeAdapter(gcg.class, new gch()).create();
   private static final TypeToken<Map<String, gcg>> h = new TypeToken<Map<String, gcg>>() {
   };
   private final Map<aez, gdn> i = Maps.newHashMap();
   private final gdj j;
   private final Map<aez, anu> k = new HashMap<>();

   public gdm(eqt $$0) {
      this.j = new gdj(this, $$0, anz.fromMap(this.k));
   }

   protected gdm.a a(anw $$0, bdv $$1) {
      gdm.a $$2 = new gdm.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (anu $$5 : $$0.a(new aez($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gcg> $$7 = arr.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gcg> $$8 : $$7.entrySet()) {
                     $$2.a(new aez($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gdm.a $$0, anw $$1, bdv $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aT) {
         for (aez $$3 : this.i.keySet()) {
            gdn $$4 = this.i.get($$3);
            if (!to.b($$4.a()) && jb.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aez $$5 : this.i.keySet()) {
            if (!jb.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.g();
   }

   static boolean a(gcf $$0, aez $$1, anz $$2) {
      aez $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gdn a(aez $$0) {
      return this.i.get($$0);
   }

   public Collection<aez> b() {
      return this.i.keySet();
   }

   public void a(gcj $$0) {
      this.j.a($$0);
   }

   public void a(gci $$0) {
      this.j.c($$0);
   }

   public void a(gci $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eqa $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.d();
   }

   public void e() {
      this.j.c();
   }

   public void f() {
      this.j.b();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void g() {
      this.j.e();
   }

   public void a(aph $$0, float $$1) {
      if ($$0 == aph.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gci $$0) {
      this.j.a($$0);
   }

   public boolean c(gci $$0) {
      return this.j.b($$0);
   }

   public void a(gdl $$0) {
      this.j.a($$0);
   }

   public void b(gdl $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aez $$0, @Nullable aph $$1) {
      this.j.a($$0, $$1);
   }

   public String h() {
      return this.j.f();
   }

   public void i() {
      this.j.a();
   }

   protected static class a {
      final Map<aez, gdn> a = Maps.newHashMap();
      private Map<aez, anu> b = Map.of();

      void a(anw $$0) {
         this.b = gcf.a.a($$0);
      }

      void a(aez $$0, gcg $$1) {
         gdn $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gdm.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gdn($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         anz $$4 = anz.fromMap(this.b);

         for (final gcf $$5 : $$1.a()) {
            final aez $$6 = $$5.a();
            gdo<gcf> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gdm.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gdo<gcf>() {
                     @Override
                     public int e() {
                        gdn $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gcf a(ash $$0) {
                        gdn $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gdm.a;
                        } else {
                           gcf $$2 = $$1.a($$0);
                           return new gcf(
                              $$2.a().toString(), new bgl($$2.c(), $$5.c()), new bgl($$2.d(), $$5.d()), $$5.e(), gcf.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gdj $$0) {
                        gdn $$1 = a.this.a.get($$6);
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

      public void a(Map<aez, gdn> $$0, Map<aez, anu> $$1, gdj $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aez, gdn> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
