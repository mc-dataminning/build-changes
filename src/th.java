import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record th(ti j, ti k) {
   public static final Codec<th> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ti.a.fieldOf("chat").forGetter(th::a), ti.a.fieldOf("narration").forGetter(th::b)).apply($$0, th::new)
   );
   public static final ti b = ti.a("chat.type.text");
   public static final aey<th> c = a("chat");
   public static final aey<th> d = a("say_command");
   public static final aey<th> e = a("msg_command_incoming");
   public static final aey<th> f = a("msg_command_outgoing");
   public static final aey<th> g = a("team_msg_command_incoming");
   public static final aey<th> h = a("team_msg_command_outgoing");
   public static final aey<th> i = a("emote_command");

   private static aey<th> a(String $$0) {
      return aey.a(jc.ar, new aez($$0));
   }

   public static void a(nr<th> $$0) {
      $$0.a(c, new th(b, ti.a("chat.type.text.narrate")));
      $$0.a(d, new th(ti.a("chat.type.announcement"), ti.a("chat.type.text.narrate")));
      $$0.a(e, new th(ti.b("commands.message.display.incoming"), ti.a("chat.type.text.narrate")));
      $$0.a(f, new th(ti.c("commands.message.display.outgoing"), ti.a("chat.type.text.narrate")));
      $$0.a(g, new th(ti.d("chat.type.team.text"), ti.a("chat.type.text.narrate")));
      $$0.a(h, new th(ti.d("chat.type.team.sent"), ti.a("chat.type.text.narrate")));
      $$0.a(i, new th(ti.a("chat.type.emote"), ti.a("chat.type.emote")));
   }

   public static th.a a(aey<th> $$0, biw $$1) {
      return a($$0, $$1.dL().G_(), $$1.N_());
   }

   public static th.a a(aey<th> $$0, dt $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static th.a a(aey<th> $$0, hr $$1, tl $$2) {
      hq<th> $$3 = $$1.d(jc.ar);
      return $$3.e($$0).a($$2);
   }

   public th.a a(tl $$0) {
      return new th.a(this, $$0);
   }

   public ti a() {
      return this.j;
   }

   public ti b() {
      return this.k;
   }

   public static record a(th a, tl b, @Nullable tl c) {
      a(th $$0, tl $$1) {
         this($$0, $$1, null);
      }

      public tl a(tl $$0) {
         return this.a.a().a($$0, this);
      }

      public tl b(tl $$0) {
         return this.a.b().a($$0, this);
      }

      public th.a c(tl $$0) {
         return new th.a(this.a, this.b, $$0);
      }

      public th.b a(hr $$0) {
         hq<th> $$1 = $$0.d(jc.ar);
         return new th.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, tl b, @Nullable tl c) {
      public b(so $$0) {
         this($$0.n(), $$0.m(), $$0.c(so::m));
      }

      public void a(so $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, so::a);
      }

      public Optional<th.a> a(hr $$0) {
         hq<th> $$1 = $$0.d(jc.ar);
         th $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new th.a($$0x, this.b, this.c));
      }
   }
}
