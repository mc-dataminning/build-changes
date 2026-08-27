import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wt(wu j, wu k) {
   public static final Codec<wt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wu.a.fieldOf("chat").forGetter(wt::a), wu.a.fieldOf("narration").forGetter(wt::b)).apply($$0, wt::new)
   );
   public static final wu b = wu.a("chat.type.text");
   public static final akl<wt> c = a("chat");
   public static final akl<wt> d = a("say_command");
   public static final akl<wt> e = a("msg_command_incoming");
   public static final akl<wt> f = a("msg_command_outgoing");
   public static final akl<wt> g = a("team_msg_command_incoming");
   public static final akl<wt> h = a("team_msg_command_outgoing");
   public static final akl<wt> i = a("emote_command");

   private static akl<wt> a(String $$0) {
      return akl.a(lf.aA, new akm($$0));
   }

   public static void a(qo<wt> $$0) {
      $$0.a(c, new wt(b, wu.a("chat.type.text.narrate")));
      $$0.a(d, new wt(wu.a("chat.type.announcement"), wu.a("chat.type.text.narrate")));
      $$0.a(e, new wt(wu.b("commands.message.display.incoming"), wu.a("chat.type.text.narrate")));
      $$0.a(f, new wt(wu.c("commands.message.display.outgoing"), wu.a("chat.type.text.narrate")));
      $$0.a(g, new wt(wu.d("chat.type.team.text"), wu.a("chat.type.text.narrate")));
      $$0.a(h, new wt(wu.d("chat.type.team.sent"), wu.a("chat.type.text.narrate")));
      $$0.a(i, new wt(wu.a("chat.type.emote"), wu.a("chat.type.emote")));
   }

   public static wt.a a(akl<wt> $$0, bru $$1) {
      return a($$0, $$1.dP().H_(), $$1.O_());
   }

   public static wt.a a(akl<wt> $$0, ee $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wt.a a(akl<wt> $$0, jl $$1, wx $$2) {
      jk<wt> $$3 = $$1.d(lf.aA);
      return new wt.a($$3.g($$0), $$2);
   }

   public wu a() {
      return this.j;
   }

   public wu b() {
      return this.k;
   }

   public static record a(ix<wt> b, wx c, Optional<wx> d) {
      public static final yv<wi, wt.a> a = yv.a(yt.b(lf.aA), wt.a::a, wz.d, wt.a::b, wz.e, wt.a::c, wt.a::new);

      a(ix<wt> $$0, wx $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wx a(wx $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wx b(wx $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wt.a c(wx $$0) {
         return new wt.a(this.b, this.c, Optional.of($$0));
      }

      public ix<wt> a() {
         return this.b;
      }

      public wx b() {
         return this.c;
      }

      public Optional<wx> c() {
         return this.d;
      }
   }
}
