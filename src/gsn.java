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

public class gsn extends auc<gsn.a> {
   public static final grg a = new grg("minecraft:empty", box.a(1.0F), box.a(1.0F), 1, grg.a.a, false, false, 16);
   public static final akn b = new akn("minecraft", "intentionally_empty");
   public static final gso c = new gso(b, null);
   public static final grg d = new grg(b.toString(), box.a(1.0F), box.a(1.0F), 1, grg.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(wx.class, new wx.b(jl.b)).registerTypeAdapter(grh.class, new gri()).create();
   private static final TypeToken<Map<String, grh>> h = new TypeToken<Map<String, grh>>() {
   };
   private final Map<akn, gso> i = Maps.newHashMap();
   private final gsk j;
   private final Map<akn, atv> k = new HashMap<>();

   public gsn(fef $$0) {
      this.j = new gsk(this, $$0, aua.fromMap(this.k));
   }

   protected gsn.a a(atx $$0, bmk $$1) {
      gsn.a $$2 = new gsn.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (atv $$5 : $$0.a(new akn($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, grh> $$7 = axv.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, grh> $$8 : $$7.entrySet()) {
                     $$2.a(new akn($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gsn.a $$0, atx $$1, bmk $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aX) {
         for (akn $$3 : this.i.keySet()) {
            gso $$4 = this.i.get($$3);
            if (!xa.b($$4.a()) && le.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (akn $$5 : this.i.keySet()) {
            if (!le.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public ewr b() {
      return this.j.i();
   }

   static boolean a(grg $$0, akn $$1, aua $$2) {
      akn $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gso a(akn $$0) {
      return this.i.get($$0);
   }

   public Collection<akn> d() {
      return this.i.keySet();
   }

   public void a(grk $$0) {
      this.j.a($$0);
   }

   public void a(grj $$0) {
      this.j.c($$0);
   }

   public void a(grj $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(fdm $$0) {
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

   public void a(avj $$0, float $$1) {
      if ($$0 == avj.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(grj $$0) {
      this.j.a($$0);
   }

   public boolean c(grj $$0) {
      return this.j.b($$0);
   }

   public void a(gsm $$0) {
      this.j.a($$0);
   }

   public void b(gsm $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable akn $$0, @Nullable avj $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<akn, gso> a = Maps.newHashMap();
      private Map<akn, atv> b = Map.of();

      void a(atx $$0) {
         this.b = grg.a.a($$0);
      }

      void a(akn $$0, grh $$1) {
         gso $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gsn.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gso($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aua $$4 = aua.fromMap(this.b);

         for (final grg $$5 : $$1.a()) {
            final akn $$6 = $$5.a();
            gsp<grg> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gsn.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gsp<grg>() {
                     @Override
                     public int e() {
                        gso $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public grg a(aym $$0) {
                        gso $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gsn.a;
                        } else {
                           grg $$2 = $$1.a($$0);
                           return new grg(
                              $$2.a().toString(), new bpd($$2.c(), $$5.c()), new bpd($$2.d(), $$5.d()), $$5.e(), grg.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gsk $$0) {
                        gso $$1 = a.this.a.get($$6);
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

      public void a(Map<akn, gso> $$0, Map<akn, atv> $$1, gsk $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akn, gso> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
