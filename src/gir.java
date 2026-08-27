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

public class gir extends aqh<gir.a> {
   public static final ghk a = new ghk("minecraft:empty", biw.a(1.0F), biw.a(1.0F), 1, ghk.a.a, false, false, 16);
   public static final ahd b = new ahd("minecraft", "intentionally_empty");
   public static final gis c = new gis(b, null);
   public static final ghk d = new ghk(b.toString(), biw.a(1.0F), biw.a(1.0F), 1, ghk.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vd.class, new vd.b()).registerTypeAdapter(ghl.class, new ghm()).create();
   private static final TypeToken<Map<String, ghl>> h = new TypeToken<Map<String, ghl>>() {
   };
   private final Map<ahd, gis> i = Maps.newHashMap();
   private final gio j;
   private final Map<ahd, aqa> k = new HashMap<>();

   public gir(eve $$0) {
      this.j = new gio(this, $$0, aqf.fromMap(this.k));
   }

   protected gir.a a(aqc $$0, bgm $$1) {
      gir.a $$2 = new gir.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aqa $$5 : $$0.a(new ahd($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, ghl> $$7 = aty.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, ghl> $$8 : $$7.entrySet()) {
                     $$2.a(new ahd($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gir.a $$0, aqc $$1, bgm $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ahd $$3 : this.i.keySet()) {
            gis $$4 = this.i.get($$3);
            if (!vg.b($$4.a()) && kd.b.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ahd $$5 : this.i.keySet()) {
            if (!kd.b.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   static boolean a(ghk $$0, ahd $$1, aqf $$2) {
      ahd $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gis a(ahd $$0) {
      return this.i.get($$0);
   }

   public Collection<ahd> b() {
      return this.i.keySet();
   }

   public void a(gho $$0) {
      this.j.a($$0);
   }

   public void a(ghn $$0) {
      this.j.c($$0);
   }

   public void a(ghn $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eul $$0) {
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

   public void a(arn $$0, float $$1) {
      if ($$0 == arn.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(ghn $$0) {
      this.j.a($$0);
   }

   public boolean c(ghn $$0) {
      return this.j.b($$0);
   }

   public void a(giq $$0) {
      this.j.a($$0);
   }

   public void b(giq $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ahd $$0, @Nullable arn $$1) {
      this.j.a($$0, $$1);
   }

   public String i() {
      return this.j.g();
   }

   public void j() {
      this.j.a();
   }

   protected static class a {
      final Map<ahd, gis> a = Maps.newHashMap();
      private Map<ahd, aqa> b = Map.of();

      void a(aqc $$0) {
         this.b = ghk.a.a($$0);
      }

      void a(ahd $$0, ghl $$1) {
         gis $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gir.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gis($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aqf $$4 = aqf.fromMap(this.b);

         for (final ghk $$5 : $$1.a()) {
            final ahd $$6 = $$5.a();
            git<ghk> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gir.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new git<ghk>() {
                     @Override
                     public int e() {
                        gis $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public ghk a(aup $$0) {
                        gis $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gir.a;
                        } else {
                           ghk $$2 = $$1.a($$0);
                           return new ghk(
                              $$2.a().toString(), new bjc($$2.c(), $$5.c()), new bjc($$2.d(), $$5.d()), $$5.e(), ghk.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gio $$0) {
                        gis $$1 = a.this.a.get($$6);
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

      public void a(Map<ahd, gis> $$0, Map<ahd, aqa> $$1, gio $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ahd, gis> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
