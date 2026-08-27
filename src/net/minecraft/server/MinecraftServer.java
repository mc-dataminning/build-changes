package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bhk<agz> implements agv, dt, AutoCloseable {
   private static final Logger n = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float o = 0.8F;
   private static final int p = 100;
   public static final int c = 50;
   private static final int q = 2000;
   private static final int r = 15000;
   private static final long s = 5000000000L;
   private static final int t = 12;
   public static final int d = 11;
   private static final int u = 441;
   private static final int v = 6000;
   private static final int w = 3;
   public static final int e = 29999984;
   public static final crw f = new crw("Demo World", crp.a, false, bin.c, false, new cro(), csl.c);
   private static final long x = 50L;
   public static final GameProfile g = new GameProfile(ac.d, "Anonymous Player");
   protected final eeb.c h;
   protected final eee i;
   private final List<Runnable> y = Lists.newArrayList();
   private bgs z = bgr.a;
   private bfh A = this.z.f();
   private Consumer<bfg> B = $$0x -> this.aO();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final amy G;
   private final amk H;
   @Nullable
   private afh I;
   @Nullable
   private afh.a J;
   private final ato K = ato.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final ij<agp> O;
   private final Map<agf<crs>, ama> P = Maps.newLinkedHashMap();
   private apq Q;
   private volatile boolean R = true;
   private boolean S;
   private int T;
   protected final Proxy j;
   private boolean U;
   private boolean V;
   private boolean W;
   private boolean X;
   @Nullable
   private String Y;
   private int Z;
   public final long[] k = new long[100];
   @Nullable
   private KeyPair aa;
   @Nullable
   private GameProfile ab;
   private boolean ac;
   private volatile boolean ad;
   private long ae;
   protected final agy l;
   private long af;
   private final Thread ag;
   private long ah = ac.b();
   private long ai;
   private boolean aj;
   private final aoo ak;
   private final agx al = new agx(this);
   @Nullable
   private edt am;
   private final ahf an = new ahf();
   private final agu ao;
   private boolean ap;
   private float aq;
   private final Executor ar;
   @Nullable
   private String as;
   private MinecraftServer.a at;
   private final eaw au;
   protected final eeh m;
   private volatile boolean av;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().w(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> n.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, eeb.c $$1, aoo $$2, ahb $$3, Proxy $$4, DataFixer $$5, agy $$6, amk $$7) {
      super("Server");
      this.O = $$3.c();
      this.m = $$3.d();
      if (!this.O.a().d(jz.aK).c(dkg.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.j = $$4;
         this.ak = $$2;
         this.at = new MinecraftServer.a($$3.a(), $$3.b());
         this.l = $$6;
         if ($$6.e() != null) {
            $$6.e().a(this);
         }

         this.G = new amy(this);
         this.H = $$7;
         this.h = $$1;
         this.i = $$1.e();
         this.L = $$5;
         this.ao = new agu(this, this.at.b.a());
         ic<cut> $$8 = this.O.a().d(jz.e).p().a(this.m.M());
         this.au = new eaw($$3.a(), $$1, $$5, $$8);
         this.ag = $$0;
         this.ar = ac.f();
      }
   }

   private void a(edw $$0) {
      $$0.a(this.aF().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void t_() {
      if (!bfn.e.c()) {
      }

      boolean $$0 = false;
      bfq $$1 = bfn.e.e();
      this.m.a(this.getServerModName(), this.K().a());
      amj $$2 = this.H.create(11);
      this.a($$2);
      this.r();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bfn.e.b();
         } catch (Throwable var5) {
            n.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void r() {
   }

   protected void a(amj $$0) {
      eeg $$1 = this.m.K();
      boolean $$2 = this.m.C();
      io<dkg> $$3 = this.O.a().d(jz.aK);
      dnd $$4 = this.m.A();
      long $$5 = $$4.b();
      long $$6 = css.a($$5);
      List<crf> $$7 = ImmutableList.of(new dmr(), new dmq(), new ccv(), new bvv(), new cdg($$1));
      dkg $$8 = $$3.a(dkg.b);
      ama $$9 = new ama(this, this.ar, this.h, $$1, crs.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(crs.h, $$9);
      edw $$10 = $$9.s();
      this.a($$10);
      this.am = new edt($$10);
      din $$11 = $$9.C_();
      if (!$$1.p()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.m);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ac().a($$9);
      if (this.m.G() != null) {
         this.aJ().a(this.m.G());
      }

      biw $$14 = $$9.H();

      for (Entry<agf<dkg>, dkg> $$15 : $$3.g()) {
         agf<dkg> $$16 = $$15.getKey();
         if ($$16 != dkg.b) {
            agf<crs> $$17 = agf.a(jz.aJ, $$16.a());
            edv $$18 = new edv(this.m, $$1);
            ama $$19 = new ama(this, this.ar, this.h, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dil.a($$19.C_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.r());
   }

   private static void a(ama $$0, eeg $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(ht.b.b(80), 0.0F);
      } else {
         aly $$4 = $$0.k();
         cqz $$5 = new cqz($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.I_()) {
            ht $$7 = $$5.l();
            $$6 = $$0.a(dmf.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;
         int $$12 = 5;

         for (int $$13 = 0; $$13 < ati.h(11); $$13++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               ht $$14 = alv.a($$0, new cqz($$5.e + $$8, $$5.f + $$9));
               if ($$14 != null) {
                  $$1.a($$14, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$15 = $$10;
               $$10 = -$$11;
               $$11 = $$15;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.H_().c(jz.au).flatMap($$0x -> $$0x.b(pv.m)).ifPresent($$3x -> ((dow)$$3x.a()).a($$0, $$4.g(), $$0.z, new ht($$1.a(), $$1.b(), $$1.c())));
         }
      }
   }

   private void a(eeh $$0) {
      $$0.a(bin.a);
      $$0.d(true);
      eeg $$1 = $$0.K();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(crp.d);
   }

   private void b(amj $$0) {
      ama $$1 = this.D();
      n.info("Preparing start region for dimension {}", $$1.ac().a());
      ht $$2 = $$1.R();
      $$0.a(new cqz($$2));
      aly $$3 = $$1.k();
      this.ah = ac.b();
      $$3.a(amf.a, new cqz($$2), 11, auj.a);

      while ($$3.b() != 441) {
         this.ah = ac.b() + 10L;
         this.v_();
      }

      this.ah = ac.b() + 10L;
      this.v_();

      for (ama $$4 : this.P.values()) {
         crn $$5 = $$4.s().b(crn.a(), "chunks");
         if ($$5 != null) {
            LongIterator $$6 = $$5.b().iterator();

            while ($$6.hasNext()) {
               long $$7 = $$6.nextLong();
               cqz $$8 = new cqz($$7);
               $$4.k().a($$8, true);
            }
         }
      }

      this.ah = ac.b() + 10L;
      this.v_();
      $$0.b();
      this.bs();
   }

   public crp u_() {
      return this.m.m();
   }

   public boolean h() {
      return this.m.n();
   }

   public abstract int i();

   public abstract int j();

   public abstract boolean k();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (ama $$4 : this.F()) {
         if (!$$0) {
            n.info("Saving chunks for level '{}'/{}", $$4, $$4.ac().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      ama $$5 = this.D();
      eeg $$6 = this.m.K();
      $$6.a($$5.C_().t());
      this.m.a(this.aJ().c());
      this.h.a(this.aU(), this.m, this.ac().r());
      if ($$1) {
         for (ama $$7 : this.F()) {
            n.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.k().a.n());
         }

         n.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.av = true;
         this.ac().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.av = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.t();
   }

   public void t() {
      if (this.z.e()) {
         this.aQ();
      }

      n.info("Stopping server");
      this.ad().b();
      this.av = true;
      if (this.Q != null) {
         n.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      n.info("Saving worlds");

      for (ama $$0 : this.F()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.k().a.f())) {
         this.ah = ac.b() + 1L;

         for (ama $$1 : this.F()) {
            $$1.k().o();
            $$1.k().a(() -> true, false);
         }

         this.v_();
      }

      this.a(false, true, false);

      for (ama $$2 : this.F()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               n.error("Exception closing the level", var5);
            }
         }
      }

      this.av = false;
      this.at.close();

      try {
         this.h.close();
      } catch (IOException var4) {
         n.error("Failed to unlock level {}", this.h.d(), var4);
      }
   }

   public String u() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean v() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.ag.join();
         } catch (InterruptedException var3) {
            n.error("Error while shutting down", var3);
         }
      }
   }

   protected void w() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.ah = ac.b();
         this.J = this.bh().orElse(null);
         this.I = this.bi();

         while (this.R) {
            long $$0 = ac.b() - this.ah;
            if ($$0 > 2000L && this.ah - this.ae >= 15000L) {
               long $$1 = $$0 / 50L;
               n.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$0, $$1);
               this.ah += $$1 * 50L;
               this.ae = this.ah;
            }

            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ac.c(), this.T);
            }

            this.ah += 50L;
            this.bt();
            this.A.a("tick");
            this.a(this::bf);
            this.A.b("nextTickWait");
            this.aj = true;
            this.ai = Math.max(ac.b() + 50L, this.ah);
            this.v_();
            this.A.c();
            this.bu();
            this.ad = true;
            bfn.e.a(this.aq);
         }
      } catch (Throwable var44) {
         n.error("Encountered an unexpected exception", var44);
         o $$4 = a(var44);
         this.b($$4.g());
         File $$5 = new File(new File(this.z(), "crash-reports"), "crash-" + ac.e() + "-server.txt");
         if ($$4.a($$5)) {
            n.error("This crash report has been saved to: {}", $$5.getAbsolutePath());
         } else {
            n.error("We were unable to save this crash report to disk.");
         }

         this.a($$4);
      } finally {
         try {
            this.S = true;
            this.t();
         } catch (Throwable var42) {
            n.error("Exception stopping the server", var42);
         } finally {
            if (this.l.e() != null) {
               this.l.e().a();
            }

            this.g();
         }
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bf() {
      return this.br() || ac.b() < (this.aj ? this.ai : this.ah);
   }

   protected void v_() {
      this.bp();
      this.c(() -> !this.bf());
   }

   protected agz a(Runnable $$0) {
      return new agz(this.T, $$0);
   }

   protected boolean a(agz $$0) {
      return $$0.a() + 3 < this.T || this.bf();
   }

   @Override
   public boolean x() {
      boolean $$0 = this.bg();
      this.aj = $$0;
      return $$0;
   }

   private boolean bg() {
      if (super.x()) {
         return true;
      } else {
         if (this.bf()) {
            for (ama $$0 : this.F()) {
               if ($$0.k().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(agz $$0) {
      this.aM().d("runTask");
      super.d($$0);
   }

   private Optional<afh.a> bh() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.h.h().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new afh.a($$2.toByteArray()));
         } catch (Exception var3) {
            n.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> y() {
      return this.h.h();
   }

   public File z() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void g() {
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.c();
      this.T++;
      this.b($$0);
      if ($$1 - this.af >= 5000000000L) {
         this.af = $$1;
         this.I = this.bi();
      }

      if (this.T % 6000 == 0) {
         n.debug("Autosave started");
         this.A.a("save");
         this.b(true, false, false);
         this.A.c();
         n.debug("Autosave finished");
      }

      this.A.a("tallying");
      long $$2 = this.k[this.T % 100] = ac.c() - $$1;
      this.aq = this.aq * 0.8F + (float)$$2 / 1000000.0F * 0.19999999F;
      long $$3 = ac.c();
      this.a($$3 - $$1);
      this.A.c();
   }

   protected void a(long $$0) {
   }

   private afh bi() {
      afh.b $$0 = this.bj();
      return new afh(ur.a(this.Y), Optional.of($$0), Optional.of(afh.c.a()), Optional.ofNullable(this.J), this.aw());
   }

   private afh.b bj() {
      List<amb> $$0 = this.Q.t();
      int $$1 = this.I();
      if (this.aj()) {
         return new afh.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = ati.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            amb $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.X() ? $$6.fR() : g);
         }

         ac.b($$3, this.K);
         return new afh.b($$1, $$0.size(), $$3);
      }
   }

   public void b(BooleanSupplier $$0) {
      this.ac().t().forEach($$0x -> $$0x.c.g());
      this.A.a("commandFunctions");
      this.aA().b();
      this.A.b("levels");

      for (ama $$1 : this.F()) {
         this.A.a(() -> $$1 + " " + $$1.ac().a());
         if (this.T % 20 == 0) {
            this.A.a("timeSync");
            this.b($$1);
            this.A.c();
         }

         this.A.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.A.c();
         this.A.c();
      }

      this.A.b("connection");
      this.ad().c();
      this.A.b("players");
      this.Q.d();
      if (aa.aT) {
         rf.a.b();
      }

      this.A.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.y.size(); $$4++) {
         this.y.get($$4).run();
      }

      this.A.b("send chunks");

      for (amb $$5 : this.Q.t()) {
         $$5.c.f.a($$5);
         $$5.c.h();
      }

      this.A.c();
   }

   private void b(ama $$0) {
      this.Q.a(new abq($$0.V(), $$0.W(), $$0.X().b(cro.l)), $$0.ac());
   }

   public void A() {
      this.A.a("timeSync");

      for (ama $$0 : this.F()) {
         this.b($$0);
      }

      this.A.c();
   }

   public boolean B() {
      return true;
   }

   public void b(Runnable $$0) {
      this.y.add($$0);
   }

   protected void b(String $$0) {
      this.as = $$0;
   }

   public boolean C() {
      return !this.ag.isAlive();
   }

   public File c(String $$0) {
      return new File(this.z(), $$0);
   }

   public final ama D() {
      return this.P.get(crs.h);
   }

   @Nullable
   public ama a(agf<crs> $$0) {
      return this.P.get($$0);
   }

   public Set<agf<crs>> E() {
      return this.P.keySet();
   }

   public Iterable<ama> F() {
      return this.P.values();
   }

   @Override
   public String G() {
      return aa.b().c();
   }

   @Override
   public int H() {
      return this.Q.m();
   }

   @Override
   public int I() {
      return this.Q.n();
   }

   public String[] J() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Data Packs", () -> this.ak.f().stream().map($$0x -> $$0x.f() + ($$0x.c().a() ? "" : " (incompatible)")).collect(Collectors.joining(", ")));
      $$0.a("Enabled Feature Flags", () -> cfx.e.b(this.m.M()).stream().map(agg::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.m.D().toString());
      if (this.as != null) {
         $$0.a("Server Id", () -> this.as);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public ath K() {
      return ath.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(ur $$0) {
      n.info($$0.getString());
   }

   public KeyPair L() {
      return this.aa;
   }

   public int M() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile N() {
      return this.ab;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ab = $$0;
   }

   public boolean O() {
      return this.ab != null;
   }

   protected void P() {
      n.info("Generating keypair");

      try {
         this.aa = ash.b();
      } catch (asi var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bin $$0, boolean $$1) {
      if ($$1 || !this.m.t()) {
         this.m.a(this.m.n() ? bin.d : $$0);
         this.bs();
         this.ac().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bs() {
      for (ama $$0 : this.F()) {
         $$0.b(this.Q(), this.W());
      }
   }

   public void b(boolean $$0) {
      this.m.d($$0);
      this.ac().t().forEach(this::c);
   }

   private void c(amb $$0) {
      edx $$1 = $$0.dL().A_();
      $$0.c.b(new yp($$1.s(), $$1.t()));
   }

   public boolean Q() {
      return this.m.s() != bin.a;
   }

   public boolean R() {
      return this.ac;
   }

   public void c(boolean $$0) {
      this.ac = $$0;
   }

   public Optional<MinecraftServer.b> S() {
      return Optional.empty();
   }

   public boolean T() {
      return this.S().filter(MinecraftServer.b::c).isPresent();
   }

   public abstract boolean l();

   public abstract int m();

   public boolean U() {
      return this.U;
   }

   public void d(boolean $$0) {
      this.U = $$0;
   }

   public boolean V() {
      return this.V;
   }

   public void e(boolean $$0) {
      this.V = $$0;
   }

   public boolean W() {
      return true;
   }

   public boolean X() {
      return true;
   }

   public abstract boolean n();

   public boolean Y() {
      return this.W;
   }

   public void f(boolean $$0) {
      this.W = $$0;
   }

   public boolean Z() {
      return this.X;
   }

   public void g(boolean $$0) {
      this.X = $$0;
   }

   public abstract boolean o();

   @Override
   public String aa() {
      return this.Y;
   }

   public void d(String $$0) {
      this.Y = $$0;
   }

   public boolean ab() {
      return this.S;
   }

   public apq ac() {
      return this.Q;
   }

   public void a(apq $$0) {
      this.Q = $$0;
   }

   public abstract boolean p();

   public void a(crp $$0) {
      this.m.a($$0);
   }

   public amy ad() {
      return this.G;
   }

   public boolean ae() {
      return this.ad;
   }

   public boolean af() {
      return false;
   }

   public boolean a(@Nullable crp $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ag() {
      return this.T;
   }

   public int ah() {
      return 16;
   }

   public boolean a(ama $$0, ht $$1, cdm $$2) {
      return false;
   }

   public boolean ai() {
      return true;
   }

   public boolean aj() {
      return false;
   }

   public Proxy ak() {
      return this.j;
   }

   public int al() {
      return this.Z;
   }

   public void c(int $$0) {
      this.Z = $$0;
   }

   public MinecraftSessionService am() {
      return this.l.b();
   }

   @Nullable
   public att an() {
      return this.l.a();
   }

   public GameProfileRepository ao() {
      return this.l.d();
   }

   @Nullable
   public apm ap() {
      return this.l.e();
   }

   @Nullable
   public afh aq() {
      return this.I;
   }

   public void ar() {
      this.af = 0L;
   }

   public int as() {
      return 29999984;
   }

   @Override
   public boolean at() {
      return super.at() && !this.ab();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ab()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread au() {
      return this.ag;
   }

   public int av() {
      return 256;
   }

   public boolean aw() {
      return false;
   }

   public long ax() {
      return this.ah;
   }

   public DataFixer ay() {
      return this.L;
   }

   public int a(@Nullable ama $$0) {
      return $$0 != null ? $$0.X().c(cro.s) : 10;
   }

   public ags az() {
      return this.at.b.e();
   }

   public agu aA() {
      return this.ao;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      ip.b $$1 = this.O.b(agp.d);
      CompletableFuture<Void> $$2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.ak::c).filter(Objects::nonNull).map(aol::e).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$1x -> {
            aot $$2x = new aow(ans.b, $$1x);
            return agq.a($$2x, $$1, this.m.M(), this.l() ? dv.a.b : dv.a.c, this.j(), this.ar, this).whenComplete(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  $$2x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$2x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.at.close();
            this.at = $$1x;
            this.ak.a($$0);
            csl $$2x = new csl(a(this.ak), this.m.M());
            this.m.a($$2x);
            this.at.b.a(this.aU());
            this.ac().h();
            this.ac().u();
            this.ao.a(this.at.b.a());
            this.au.a(this.at.a);
         }, this);
      if (this.bl()) {
         this.c($$2::isDone);
      }

      return $$2;
   }

   public static csl a(aoo $$0, crg $$1, boolean $$2, cfv $$3) {
      $$0.a();
      if ($$2) {
         $$0.a(Collections.singleton("vanilla"));
         return csl.c;
      } else {
         Set<String> $$4 = Sets.newLinkedHashSet();

         for (String $$5 : $$1.a()) {
            if ($$0.d($$5)) {
               $$4.add($$5);
            } else {
               n.warn("Missing data pack {}", $$5);
            }
         }

         for (aol $$6 : $$0.c()) {
            String $$7 = $$6.f();
            if (!$$1.b().contains($$7)) {
               cfv $$8 = $$6.d();
               boolean $$9 = $$4.contains($$7);
               if (!$$9 && $$6.j().a()) {
                  if ($$8.a($$3)) {
                     n.info("Found new data pack {}, loading it automatically", $$7);
                     $$4.add($$7);
                  } else {
                     n.info("Found new data pack {}, but can't load it due to missing features {}", $$7, cfx.a($$3, $$8));
                  }
               }

               if ($$9 && !$$8.a($$3)) {
                  n.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$7, cfx.a($$3, $$8));
                  $$4.remove($$7);
               }
            }
         }

         if ($$4.isEmpty()) {
            n.info("No datapacks selected, forcing vanilla");
            $$4.add("vanilla");
         }

         $$0.a($$4);
         crg $$10 = a($$0);
         cfv $$11 = $$0.e();
         return new csl($$10, $$11);
      }
   }

   private static crg a(aoo $$0) {
      Collection<String> $$1 = $$0.d();
      List<String> $$2 = ImmutableList.copyOf($$1);
      List<String> $$3 = $$0.b().stream().filter($$1x -> !$$1.contains($$1x)).collect(ImmutableList.toImmutableList());
      return new crg($$2, $$3);
   }

   public void a(du $$0) {
      if (this.aK()) {
         apq $$1 = $$0.m().ac();
         apy $$2 = $$1.i();

         for (amb $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fR())) {
               $$4.c.b(ur.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public aoo aB() {
      return this.ak;
   }

   public dv aC() {
      return this.at.b.d();
   }

   public du aD() {
      ama $$0 = this.D();
      return new du(this, $$0 == null ? eji.b : eji.a($$0.R()), ejh.a, $$0, 4, "Server", ur.b("Server"), this, null);
   }

   @Override
   public boolean k_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public abstract boolean U_();

   public coi aE() {
      return this.at.b.c();
   }

   public agx aF() {
      return this.al;
   }

   public edt aG() {
      if (this.am == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.am;
      }
   }

   public eeo aH() {
      return this.at.b.b();
   }

   public cro aI() {
      return this.D().X();
   }

   public ahf aJ() {
      return this.an;
   }

   public boolean aK() {
      return this.ap;
   }

   public void h(boolean $$0) {
      this.ap = $$0;
   }

   public float aL() {
      return this.aq;
   }

   public int c(GameProfile $$0) {
      if (this.ac().f($$0)) {
         aps $$1 = this.ac().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.O()) {
            return this.ac().v() ? 4 : 0;
         } else {
            return this.i();
         }
      } else {
         return 0;
      }
   }

   public bfh aM() {
      return this.A;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<agf<crs>, ama> $$2 : this.P.entrySet()) {
            agg $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         n.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bm()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aL()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.k)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.f()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final cro $$3 = this.aI();
         cro.a(new cro.c() {
            @Override
            public <T extends cro.g<T>> void a(cro.e<T> $$0, cro.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<atj.a> $$2;
         try {
            $$2 = Lists.newArrayList(atj.a());
         } catch (Throwable var7) {
            n.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (atj.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bt() {
      if (this.D) {
         this.z = bgq.a(new bgu(ac.b, this.l()), ac.b, ac.g(), new bgw("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A = bfk.a(this.z.f(), bfk.a("Server"));
      this.z.c();
      this.A.a();
   }

   private void bu() {
      this.A.b();
      this.z.d();
   }

   public boolean aN() {
      return this.z.e();
   }

   public void a(Consumer<bfg> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aO();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aO() {
      this.z = bgr.a;
   }

   public void aP() {
      this.z.a();
   }

   public void aQ() {
      this.z.b();
      this.A = this.z.f();
   }

   public Path a(edz $$0) {
      return this.h.a($$0);
   }

   public boolean aR() {
      return true;
   }

   public eaw aS() {
      return this.au;
   }

   public eeh aT() {
      return this.m;
   }

   public ip.b aU() {
      return this.O.a();
   }

   public ij<agp> aV() {
      return this.O;
   }

   public ane a(amb $$0) {
      return ane.a;
   }

   public amc b(amb $$0) {
      return (amc)(this.R() ? new alr($$0) : new amc($$0));
   }

   @Nullable
   public crp aW() {
      return null;
   }

   public apd aX() {
      return this.at.a;
   }

   public boolean aY() {
      return this.av;
   }

   public boolean aZ() {
      return this.F || this.E != null;
   }

   public void ba() {
      this.F = true;
   }

   public bfg bb() {
      if (this.E == null) {
         return bfc.a;
      } else {
         bfg $$0 = this.E.a(ac.c(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bc() {
      return 1000000;
   }

   public void a(ur $$0, un.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         n.info("[{}] {}", $$2, $$3);
      } else {
         n.info("{}", $$3);
      }
   }

   public um bd() {
      return um.a;
   }

   public boolean be() {
      return true;
   }

   static record a(aot a, agq b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(String a, String b, boolean c, @Nullable ur d) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bfg a(final long $$0, final int $$1) {
         return new bfg() {
            @Override
            public List<bfj> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
