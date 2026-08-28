import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class gue {
   private static final Marker d = MarkerFactory.getMarker("SOUNDS");
   private static final Logger e = LogUtils.getLogger();
   private static final float f = 0.5F;
   private static final float g = 2.0F;
   private static final float h = 0.0F;
   private static final float i = 1.0F;
   private static final int j = 20;
   private static final Set<akk> k = Sets.newHashSet();
   private static final long l = 1000L;
   public static final String a = "FOR THE DEBUG!";
   public static final String b = "OpenAL Soft on ";
   public static final int c = "OpenAL Soft on ".length();
   private final guh m;
   private final ffx n;
   private boolean o;
   private final eyi p = new eyi();
   private final eyj q = this.p.e();
   private final gud r;
   private final guf s = new guf();
   private final gtw t = new gtw(this.p, this.s);
   private int u;
   private long v;
   private final AtomicReference<gue.a> w = new AtomicReference<>(gue.a.c);
   private final Map<gtc, gtw.a> x = Maps.newHashMap();
   private final Multimap<avi, gtc> y = HashMultimap.create();
   private final List<gtd> z = Lists.newArrayList();
   private final Map<gtc, Integer> A = Maps.newHashMap();
   private final Map<gtc, Integer> B = Maps.newHashMap();
   private final List<gug> C = Lists.newArrayList();
   private final List<gtd> D = Lists.newArrayList();
   private final List<gsz> E = Lists.newArrayList();

   public gue(guh $$0, ffx $$1, atz $$2) {
      this.m = $$0;
      this.n = $$1;
      this.r = new gud($$2);
   }

   public void a() {
      k.clear();

      for (avg $$0 : lq.b) {
         if ($$0 != avh.qY) {
            akk $$1 = $$0.a();
            if (this.m.a($$1) == null) {
               e.warn("Missing sound for event: {}", lq.b.b($$0));
               k.add($$1);
            }
         }
      }

      this.b();
      this.j();
   }

   private synchronized void j() {
      if (!this.o) {
         try {
            String $$0 = this.n.at().c();
            this.p.a("".equals($$0) ? null : $$0, this.n.X().c());
            this.q.b();
            this.q.a(this.n.a(avi.a));
            this.r.a(this.E).thenRun(this.E::clear);
            this.o = true;
            e.info(d, "Sound engine started");
         } catch (RuntimeException var2) {
            e.error(d, "Error starting SoundSystem. Turning off sounds & music", var2);
         }
      }
   }

   private float a(@Nullable avi $$0) {
      return $$0 != null && $$0 != avi.a ? this.n.a($$0) : 1.0F;
   }

   public void a(avi $$0, float $$1) {
      if (this.o) {
         if ($$0 == avi.a) {
            this.q.a($$1);
         } else {
            this.x.forEach(($$0x, $$1x) -> {
               float $$2 = this.h($$0x);
               $$1x.a($$1xx -> {
                  if ($$2 <= 0.0F) {
                     $$1xx.f();
                  } else {
                     $$1xx.b($$2);
                  }
               });
            });
         }
      }
   }

   public void b() {
      if (this.o) {
         this.d();
         this.r.a();
         this.p.d();
         this.o = false;
      }
   }

   public void c() {
      if (this.o) {
         this.p.d();
      }
   }

   public void a(gtc $$0) {
      if (this.o) {
         gtw.a $$1 = this.x.get($$0);
         if ($$1 != null) {
            $$1.a(eyh::f);
         }
      }
   }

   public void d() {
      if (this.o) {
         this.s.a();
         this.x.values().forEach($$0 -> $$0.a(eyh::f));
         this.x.clear();
         this.t.b();
         this.A.clear();
         this.z.clear();
         this.y.clear();
         this.B.clear();
         this.D.clear();
      }
   }

   public void a(gug $$0) {
      this.C.add($$0);
   }

   public void b(gug $$0) {
      this.C.remove($$0);
   }

   private boolean k() {
      if (this.p.h()) {
         e.info("Audio device was lost!");
         return true;
      } else {
         long $$0 = ac.c();
         boolean $$1 = $$0 - this.v >= 1000L;
         if ($$1) {
            this.v = $$0;
            if (this.w.compareAndSet(gue.a.c, gue.a.a)) {
               String $$2 = this.n.at().c();
               ac.h().execute(() -> {
                  if ("".equals($$2)) {
                     if (this.p.c()) {
                        e.info("System default audio device has changed!");
                        this.w.compareAndSet(gue.a.a, gue.a.b);
                     }
                  } else if (!this.p.b().equals($$2) && this.p.g().contains($$2)) {
                     e.info("Preferred audio device has become available!");
                     this.w.compareAndSet(gue.a.a, gue.a.b);
                  }

                  this.w.compareAndSet(gue.a.a, gue.a.c);
               });
            }
         }

         return this.w.compareAndSet(gue.a.b, gue.a.c);
      }
   }

   public void a(boolean $$0) {
      if (this.k()) {
         this.a();
      }

      if (!$$0) {
         this.l();
      }

      this.t.a();
   }

   private void l() {
      this.u++;
      this.D.stream().filter(gtc::s).forEach(this::c);
      this.D.clear();

      for (gtd $$0 : this.z) {
         if (!$$0.s()) {
            this.a((gtc)$$0);
         }

         $$0.q();
         if ($$0.m()) {
            this.a((gtc)$$0);
         } else {
            float $$1 = this.h($$0);
            float $$2 = this.g($$0);
            ewf $$3 = new ewf($$0.h(), $$0.i(), $$0.j());
            gtw.a $$4 = this.x.get($$0);
            if ($$4 != null) {
               $$4.a($$3x -> {
                  $$3x.b($$1);
                  $$3x.a($$2);
                  $$3x.a($$3);
               });
            }
         }
      }

      Iterator<Entry<gtc, gtw.a>> $$5 = this.x.entrySet().iterator();

      while ($$5.hasNext()) {
         Entry<gtc, gtw.a> $$6 = $$5.next();
         gtw.a $$7 = $$6.getValue();
         gtc $$8 = $$6.getKey();
         float $$9 = this.n.a($$8.c());
         if ($$9 <= 0.0F) {
            $$7.a(eyh::f);
            $$5.remove();
         } else if ($$7.a()) {
            int $$10 = this.B.get($$8);
            if ($$10 <= this.u) {
               if (e($$8)) {
                  this.A.put($$8, this.u + $$8.e());
               }

               $$5.remove();
               e.debug(d, "Removed channel {} because it's not playing anymore", $$7);
               this.B.remove($$8);

               try {
                  this.y.remove($$8.c(), $$8);
               } catch (RuntimeException var8) {
               }

               if ($$8 instanceof gtd) {
                  this.z.remove($$8);
               }
            }
         }
      }

      Iterator<Entry<gtc, Integer>> $$11 = this.A.entrySet().iterator();

      while ($$11.hasNext()) {
         Entry<gtc, Integer> $$12 = $$11.next();
         if (this.u >= $$12.getValue()) {
            gtc $$13 = $$12.getKey();
            if ($$13 instanceof gtd) {
               ((gtd)$$13).q();
            }

            this.c($$13);
            $$11.remove();
         }
      }
   }

   private static boolean d(gtc $$0) {
      return $$0.e() > 0;
   }

   private static boolean e(gtc $$0) {
      return $$0.d() && d($$0);
   }

   private static boolean f(gtc $$0) {
      return $$0.d() && !d($$0);
   }

   public boolean b(gtc $$0) {
      if (!this.o) {
         return false;
      } else {
         return this.B.containsKey($$0) && this.B.get($$0) <= this.u ? true : this.x.containsKey($$0);
      }
   }

   public void c(gtc $$0) {
      if (this.o) {
         if ($$0.s()) {
            gui $$1 = $$0.a(this.m);
            akk $$2 = $$0.a();
            if ($$1 == null) {
               if (k.add($$2)) {
                  e.warn(d, "Unable to play unknown soundEvent: {}", $$2);
               }
            } else {
               gsz $$3 = $$0.b();
               if ($$3 != guh.d) {
                  if ($$3 == guh.a) {
                     if (k.add($$2)) {
                        e.warn(d, "Unable to play empty soundEvent: {}", $$2);
                     }
                  } else {
                     float $$4 = $$0.f();
                     float $$5 = Math.max($$4, 1.0F) * (float)$$3.i();
                     avi $$6 = $$0.c();
                     float $$7 = this.a($$4, $$6);
                     float $$8 = this.g($$0);
                     gtc.a $$9 = $$0.k();
                     boolean $$10 = $$0.l();
                     if ($$7 == 0.0F && !$$0.r()) {
                        e.debug(d, "Skipped playing sound {}, volume was zero.", $$3.a());
                     } else {
                        ewf $$11 = new ewf($$0.h(), $$0.i(), $$0.j());
                        if (!this.C.isEmpty()) {
                           float $$12 = !$$10 && $$9 != gtc.a.a ? $$5 : Float.POSITIVE_INFINITY;

                           for (gug $$13 : this.C) {
                              $$13.a($$0, $$1, $$12);
                           }
                        }

                        if (this.q.a() <= 0.0F) {
                           e.debug(d, "Skipped playing soundEvent: {}, master volume was zero", $$2);
                        } else {
                           boolean $$14 = f($$0);
                           boolean $$15 = $$3.g();
                           CompletableFuture<gtw.a> $$16 = this.t.a($$3.g() ? eyi.c.b : eyi.c.a);
                           gtw.a $$17 = $$16.join();
                           if ($$17 == null) {
                              if (aa.aW) {
                                 e.warn("Failed to create new sound handle");
                              }
                           } else {
                              e.debug(d, "Playing sound {} for event {}", $$3.a(), $$2);
                              this.B.put($$0, this.u + 20);
                              this.x.put($$0, $$17);
                              this.y.put($$6, $$0);
                              $$17.a($$8x -> {
                                 $$8x.a($$8);
                                 $$8x.b($$7);
                                 if ($$9 == gtc.a.b) {
                                    $$8x.c($$5);
                                 } else {
                                    $$8x.i();
                                 }

                                 $$8x.a($$14 && !$$15);
                                 $$8x.a($$11);
                                 $$8x.b($$10);
                              });
                              if (!$$15) {
                                 this.r.a($$3.b()).thenAccept($$1x -> $$17.a($$1xx -> {
                                       $$1xx.a($$1x);
                                       $$1xx.c();
                                    }));
                              } else {
                                 this.r.a($$3.b(), $$14).thenAccept($$1x -> $$17.a($$1xx -> {
                                       $$1xx.a($$1x);
                                       $$1xx.c();
                                    }));
                              }

                              if ($$0 instanceof gtd) {
                                 this.z.add((gtd)$$0);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void a(gtd $$0) {
      this.D.add($$0);
   }

   public void a(gsz $$0) {
      this.E.add($$0);
   }

   private float g(gtc $$0) {
      return ayg.a($$0.g(), 0.5F, 2.0F);
   }

   private float h(gtc $$0) {
      return this.a($$0.f(), $$0.c());
   }

   private float a(float $$0, avi $$1) {
      return ayg.a($$0 * this.a($$1), 0.0F, 1.0F);
   }

   public void e() {
      if (this.o) {
         this.t.a($$0 -> $$0.forEach(eyh::d));
      }
   }

   public void f() {
      if (this.o) {
         this.t.a($$0 -> $$0.forEach(eyh::e));
      }
   }

   public void a(gtc $$0, int $$1) {
      this.A.put($$0, this.u + $$1);
   }

   public void a(ffe $$0) {
      if (this.o && $$0.h()) {
         eyk $$1 = new eyk($$0.b(), new ewf($$0.l()), new ewf($$0.m()));
         this.s.execute(() -> this.q.a($$1));
      }
   }

   public void a(@Nullable akk $$0, @Nullable avi $$1) {
      if ($$1 != null) {
         for (gtc $$2 : this.y.get($$1)) {
            if ($$0 == null || $$2.a().equals($$0)) {
               this.a($$2);
            }
         }
      } else if ($$0 == null) {
         this.d();
      } else {
         for (gtc $$3 : this.x.keySet()) {
            if ($$3.a().equals($$0)) {
               this.a($$3);
            }
         }
      }
   }

   public String g() {
      return this.p.f();
   }

   public List<String> h() {
      return this.p.g();
   }

   public eyk i() {
      return this.q.c();
   }

   static enum a {
      a,
      b,
      c;
   }
}
