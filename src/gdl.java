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

public class gdl extends anu<gdl.a> {
   public static final gce a = new gce("minecraft:empty", bfu.a(1.0F), bfu.a(1.0F), 1, gce.a.a, false, false, 16);
   public static final aeu b = new aeu("minecraft", "intentionally_empty");
   public static final gdm c = new gdm(b, null);
   public static final gce d = new gce(b.toString(), bfu.a(1.0F), bfu.a(1.0F), 1, gce.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(ti.class, new ti.a()).registerTypeAdapter(gcf.class, new gcg()).create();
   private static final TypeToken<Map<String, gcf>> h = new TypeToken<Map<String, gcf>>() {
   };
   private final Map<aeu, gdm> i = Maps.newHashMap();
   private final gdi j;
   private final Map<aeu, ann> k = new HashMap<>();

   public gdl(equ $$0) {
      this.j = new gdi(this, $$0, ans.fromMap(this.k));
   }

   protected gdl.a a(anp $$0, bdk $$1) {
      gdl.a $$2 = new gdl.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (ann $$5 : $$0.a(new aeu($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gcf> $$7 = arj.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gcf> $$8 : $$7.entrySet()) {
                     $$2.a(new aeu($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gdl.a $$0, anp $$1, bdk $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aS) {
         for (aeu $$3 : this.i.keySet()) {
            gdm $$4 = this.i.get($$3);
            if (!tk.b($$4.a()) && jd.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aeu $$5 : this.i.keySet()) {
            if (!jd.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.g();
   }

   static boolean a(gce $$0, aeu $$1, ans $$2) {
      aeu $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gdm a(aeu $$0) {
      return this.i.get($$0);
   }

   public Collection<aeu> b() {
      return this.i.keySet();
   }

   public void a(gci $$0) {
      this.j.a($$0);
   }

   public void a(gch $$0) {
      this.j.c($$0);
   }

   public void a(gch $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eqb $$0) {
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

   public void a(apa $$0, float $$1) {
      if ($$0 == apa.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gch $$0) {
      this.j.a($$0);
   }

   public boolean c(gch $$0) {
      return this.j.b($$0);
   }

   public void a(gdk $$0) {
      this.j.a($$0);
   }

   public void b(gdk $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aeu $$0, @Nullable apa $$1) {
      this.j.a($$0, $$1);
   }

   public String h() {
      return this.j.f();
   }

   public void i() {
      this.j.a();
   }

   protected static class a {
      final Map<aeu, gdm> a = Maps.newHashMap();
      private Map<aeu, ann> b = Map.of();

      void a(anp $$0) {
         this.b = gce.a.a($$0);
      }

      void a(aeu $$0, gcf $$1) {
         gdm $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gdl.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gdm($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         ans $$4 = ans.fromMap(this.b);

         for (final gce $$5 : $$1.a()) {
            final aeu $$6 = $$5.a();
            gdn<gce> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gdl.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gdn<gce>() {
                     @Override
                     public int e() {
                        gdm $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gce a(arx $$0) {
                        gdm $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gdl.a;
                        } else {
                           gce $$2 = $$1.a($$0);
                           return new gce(
                              $$2.a().toString(), new bga($$2.c(), $$5.c()), new bga($$2.d(), $$5.d()), $$5.e(), gce.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gdi $$0) {
                        gdm $$1 = a.this.a.get($$6);
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

      public void a(Map<aeu, gdm> $$0, Map<aeu, ann> $$1, gdi $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aeu, gdm> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
