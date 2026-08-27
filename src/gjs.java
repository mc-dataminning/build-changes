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

public class gjs extends aqo<gjs.a> {
   public static final gil a = new gil("minecraft:empty", bjd.a(1.0F), bjd.a(1.0F), 1, gil.a.a, false, false, 16);
   public static final ahh b = new ahh("minecraft", "intentionally_empty");
   public static final gjt c = new gjt(b, null);
   public static final gil d = new gil(b.toString(), bjd.a(1.0F), bjd.a(1.0F), 1, gil.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vg.class, new vg.b()).registerTypeAdapter(gim.class, new gin()).create();
   private static final TypeToken<Map<String, gim>> h = new TypeToken<Map<String, gim>>() {
   };
   private final Map<ahh, gjt> i = Maps.newHashMap();
   private final gjp j;
   private final Map<ahh, aqh> k = new HashMap<>();

   public gjs(evv $$0) {
      this.j = new gjp(this, $$0, aqm.fromMap(this.k));
   }

   protected gjs.a a(aqj $$0, bgt $$1) {
      gjs.a $$2 = new gjs.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aqh $$5 : $$0.a(new ahh($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gim> $$7 = auf.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gim> $$8 : $$7.entrySet()) {
                     $$2.a(new ahh($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gjs.a $$0, aqj $$1, bgt $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ahh $$3 : this.i.keySet()) {
            gjt $$4 = this.i.get($$3);
            if (!vj.b($$4.a()) && kd.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ahh $$5 : this.i.keySet()) {
            if (!kd.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public eoh b() {
      return this.j.i();
   }

   static boolean a(gil $$0, ahh $$1, aqm $$2) {
      ahh $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gjt a(ahh $$0) {
      return this.i.get($$0);
   }

   public Collection<ahh> d() {
      return this.i.keySet();
   }

   public void a(gip $$0) {
      this.j.a($$0);
   }

   public void a(gio $$0) {
      this.j.c($$0);
   }

   public void a(gio $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(evc $$0) {
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

   public void a(aru $$0, float $$1) {
      if ($$0 == aru.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gio $$0) {
      this.j.a($$0);
   }

   public boolean c(gio $$0) {
      return this.j.b($$0);
   }

   public void a(gjr $$0) {
      this.j.a($$0);
   }

   public void b(gjr $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ahh $$0, @Nullable aru $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ahh, gjt> a = Maps.newHashMap();
      private Map<ahh, aqh> b = Map.of();

      void a(aqj $$0) {
         this.b = gil.a.a($$0);
      }

      void a(ahh $$0, gim $$1) {
         gjt $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gjs.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gjt($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aqm $$4 = aqm.fromMap(this.b);

         for (final gil $$5 : $$1.a()) {
            final ahh $$6 = $$5.a();
            gju<gil> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gjs.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gju<gil>() {
                     @Override
                     public int e() {
                        gjt $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gil a(auw $$0) {
                        gjt $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gjs.a;
                        } else {
                           gil $$2 = $$1.a($$0);
                           return new gil(
                              $$2.a().toString(), new bjj($$2.c(), $$5.c()), new bjj($$2.d(), $$5.d()), $$5.e(), gil.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gjp $$0) {
                        gjt $$1 = a.this.a.get($$6);
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

      public void a(Map<ahh, gjt> $$0, Map<ahh, aqh> $$1, gjp $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ahh, gjt> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
