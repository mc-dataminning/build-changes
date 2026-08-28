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

public class guh extends aub<guh.a> {
   public static final gsz a = new gsz("minecraft:empty", bph.a(1.0F), bph.a(1.0F), 1, gsz.a.a, false, false, 16);
   public static final akk b = new akk("minecraft", "intentionally_empty");
   public static final gui c = new gui(b, null);
   public static final gsz d = new gsz(b.toString(), bph.a(1.0F), bph.a(1.0F), 1, gsz.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(wu.class, new wu.b(jx.b)).registerTypeAdapter(gta.class, new gtb()).create();
   private static final TypeToken<Map<String, gta>> h = new TypeToken<Map<String, gta>>() {
   };
   private final Map<akk, gui> i = Maps.newHashMap();
   private final gue j;
   private final Map<akk, atu> k = new HashMap<>();

   public guh(ffx $$0) {
      this.j = new gue(this, $$0, atz.fromMap(this.k));
   }

   protected guh.a a(atw $$0, bmu $$1) {
      guh.a $$2 = new guh.a();
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
                  Map<String, gta> $$7 = axw.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gta> $$8 : $$7.entrySet()) {
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

   protected void a(guh.a $$0, atw $$1, bmu $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (akk $$3 : this.i.keySet()) {
            gui $$4 = this.i.get($$3);
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

   public eyk b() {
      return this.j.i();
   }

   static boolean a(gsz $$0, akk $$1, atz $$2) {
      akk $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gui a(akk $$0) {
      return this.i.get($$0);
   }

   public Collection<akk> d() {
      return this.i.keySet();
   }

   public void a(gtd $$0) {
      this.j.a($$0);
   }

   public void a(gtc $$0) {
      this.j.c($$0);
   }

   public void a(gtc $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(ffe $$0) {
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

   public void b(gtc $$0) {
      this.j.a($$0);
   }

   public boolean c(gtc $$0) {
      return this.j.b($$0);
   }

   public void a(gug $$0) {
      this.j.a($$0);
   }

   public void b(gug $$0) {
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
      final Map<akk, gui> a = Maps.newHashMap();
      private Map<akk, atu> b = Map.of();

      void a(atw $$0) {
         this.b = gsz.a.a($$0);
      }

      void a(akk $$0, gta $$1) {
         gui $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               guh.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gui($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         atz $$4 = atz.fromMap(this.b);

         for (final gsz $$5 : $$1.a()) {
            final akk $$6 = $$5.a();
            guj<gsz> $$8;
            switch ($$5.f()) {
               case a:
                  if (!guh.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new guj<gsz>() {
                     @Override
                     public int e() {
                        gui $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gsz a(ayo $$0) {
                        gui $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return guh.a;
                        } else {
                           gsz $$2 = $$1.a($$0);
                           return new gsz(
                              $$2.a().toString(), new bpn($$2.c(), $$5.c()), new bpn($$2.d(), $$5.d()), $$5.e(), gsz.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gue $$0) {
                        gui $$1 = a.this.a.get($$6);
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

      public void a(Map<akk, gui> $$0, Map<akk, atu> $$1, gue $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akk, gui> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
